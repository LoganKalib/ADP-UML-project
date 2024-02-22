package za.ac.cput.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode, courseName;
    private List<Subject> subjects = new ArrayList<Subject>();

    public Course(String courseCode, String courseName, List<Subject> subjects) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.subjects = subjects;
    }

    public Course() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
