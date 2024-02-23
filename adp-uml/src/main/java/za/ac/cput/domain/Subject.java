package za.ac.cput.domain;

import java.util.*;

public class Subject {

    private String subjectName, subjectCode;

    private List<Mark> marks = new ArrayList<Mark>();

    public Subject(String subjectName, String subjectCode, List<Mark> marks) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.marks = marks;
    }

    public Subject() {
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                ", marks=" + marks +
                '}';
    }
}
