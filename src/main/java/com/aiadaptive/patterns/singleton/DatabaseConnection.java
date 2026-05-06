package com.aiadaptive.patterns.singleton;

//Matches:
//
//System-wide DB access
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}