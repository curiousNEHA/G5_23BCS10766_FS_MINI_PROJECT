package com.example.spring_boot_wwc_full_stack.service;

import com.example.spring_boot_wwc_full_stack.model.Student;
import com.example.spring_boot_wwc_full_stack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Register a new student
    public Student registerStudent(Student student) {
        // Validate name and course
        if(student.getName() == null || student.getName().isEmpty() ||
                student.getCourse() == null || student.getCourse().isEmpty()) {
            throw new IllegalArgumentException("Name and Course must not be empty");
        }

        // Check for duplicate student ID
        if(studentRepository.existsById(student.getId())) {
            throw new IllegalStateException("Student ID already exists");
        }

        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    // Delete student
    public boolean deleteStudent(int id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
