package com.example.spring_boot_wwc_full_stack.repository;

import com.example.spring_boot_wwc_full_stack.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Check if a student with the given ID already exists
    boolean existsById(int id);
}
