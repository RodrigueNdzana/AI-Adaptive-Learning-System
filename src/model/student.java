package model;

public class Student extends User {
    private String disabilityStatus;

    public Student(String id, String name, String email, String disabilityStatus) {
        super(id, name, email);
        this.disabilityStatus = disabilityStatus;
    }

    public void viewDashboard() {
        System.out.println("Viewing dashboard");
    }
}