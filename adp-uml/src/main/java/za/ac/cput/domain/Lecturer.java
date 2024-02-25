package za.ac.cput.domain;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Lecturer extends Person{

    private ConcurrentHashMap<Integer,Subject> subsTaught;

    private int staffNumber;

    public Lecturer(String name, String surname, String email, String password, ConcurrentHashMap<Integer,Subject> subsTaught, int staffNumber) {
        super(name, surname, email, password);
        this.subsTaught = subsTaught;
        this.staffNumber = staffNumber;
    }

    public Lecturer() {
    }

    public ConcurrentHashMap<Integer,Subject> getSubsTaught() {
        return subsTaught;
    }

    public void setSubsTaught(ConcurrentHashMap<Integer,Subject> subsTaught) {
        this.subsTaught = subsTaught;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "subsTaught=" + subsTaught +
                ", staffNumber='" + staffNumber + '\'' +
                '}';
    }

    public int createMark(Subject subject, Mark mark, Integer key){
        if(this.subsTaught.containsValue(subject)){
            subject.getMarks().put(key,mark);
            return 0;
        }
        return -1;
    }

    //this function needs to be changed, it currently updates the mark for all the students

    /*public void markStudent(Student student, Subject subject, Mark newMark, Mark oldMark){
        student.getRegCourse().getSubjects().keySet(subject).getMappedValue()
                .getMarks().keySet(oldMark).getMappedValue().setTotalEarned(newMark.getTotalEarned());

    }*/
}
