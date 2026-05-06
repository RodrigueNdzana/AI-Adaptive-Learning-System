package com.aiadaptive.repositories;

import com.aiadaptive.domain.Student;

import java.util.*;

public class DatabaseStudentRepository implements StudentRepository {

    @Override
    public void save(Student student) {
        // TODO: Save to database
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.empty(); // TODO
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(String id) {
        // TODO
    }
}