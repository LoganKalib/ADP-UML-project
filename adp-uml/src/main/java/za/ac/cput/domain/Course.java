package za.ac.cput.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Course {

    private String courseCode, courseName;
    private ConcurrentHashMap<Integer,Subject> subjects;

    public Course(String courseCode, String courseName, ConcurrentHashMap<Integer,Subject> subjects) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.subjects = subjects;
    }

    public Course(Course course){
        this.courseCode = course.courseCode;
        this.courseName = course.courseName;
        this.subjects = course.subjects;
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

    public ConcurrentHashMap<Integer,Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ConcurrentHashMap<Integer,Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Course{" + "\n" +
                "courseCode='" + courseCode + "\n" +
                ", courseName='" + courseName + "\n" +
                ", subjects=" +"\n" + subjects +
                '}';
    }

    public double calcTotalPrice(){
        if(this.subjects == null){
            return -1;
        }

        double total = 0;
        for(int key: this.subjects.keySet()){
            total += this.subjects.get(key).getPrice();
        }

        return total;
    }
}
