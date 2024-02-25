package za.ac.cput.domain;

import java.util.*;

public class Lecturer extends Person {

    private int employeeNumber;
    private Subject subject;
    private Person staffDetails = new Person();
    private List<Subject> subsTaught = new ArrayList<Subject>();


    public Lecturer(String name, String surname, String email, String password, int employeeNumber, Subject subject) {
        super(name, surname, email, password);
        this.employeeNumber = employeeNumber;
        this.subject = subject;
    }

        public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Person getStaffDetails() {
        return staffDetails;
    }

    public void setStaffDetails(Person staffDetails) {
        this.staffDetails = staffDetails;
    }

    public List<Subject> getSubsTaught() {
        return subsTaught;
    }

    public void setSubsTaught(List<Subject> subsTaught) {
        this.subsTaught = subsTaught;
    }

    @java.lang.Override
    public String toString() {
        return "Lecturer{" +
                "employeeNumber=" + employeeNumber +
                ", subject=" + subject +
                ", staffDetails=" + staffDetails +
                ", subsTaught=" + subsTaught +
                '}';
    }
}


    }
