package com.aiadaptive.services;

import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    // Constructor Injection
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student createStudent(Student student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            throw new IllegalArgumentException("Student name is required and cannot be null or empty.");
        }

        return repo.save(student);
    }


    public List<Student> getAllStudents() {
        return repo.findAll();
        }
}