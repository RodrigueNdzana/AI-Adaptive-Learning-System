package com.aiadaptive.factories;


import com.aiadaptive.repositories.StudentRepository;
import com.aiadaptive.repositories.inMemory.InMemoryStudentRepository;


public class RepositoryFactory {

    public static StudentRepository getStudentRepository(String type) {

        switch (type.toUpperCase()) {

            case "MEMORY":
                return new InMemoryStudentRepository();

            case "DATABASE":
                throw new UnsupportedOperationException("Database not implemented yet");

            default:
                throw new IllegalArgumentException("Invalid repository type");
        }
    }
}
