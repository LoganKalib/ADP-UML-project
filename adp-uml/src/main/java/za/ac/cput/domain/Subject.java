package za.ac.cput.domain;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Subject {
    private ConcurrentHashMap<Integer,Mark> marks = new ConcurrentHashMap<>();
    private String subjectCode, subjectName;
    private double price;

    public Subject(ConcurrentHashMap<Integer,Mark> marks, String subjectCode, String subjectName, double price) {
        this.marks = marks;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.price = price;
    }

    public Subject(Subject subject){
        this.marks = subject.getMarks();

    }
    public Subject(String subjectCode, String subjectName, double price) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.price = price;
    }

    public Subject() {
    }

    public ConcurrentHashMap<Integer,Mark> getMarks() {
        return marks;
    }

    public void setMarks(ConcurrentHashMap<Integer,Mark> marks) {
        this.marks = marks;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Subject{" + "\n" +
                "marks=" + marks + "\n" +
                ", subjectCode='" + subjectCode + "\n" +
                ", subjectName='" + subjectName + "\n" +
                ", price=" + price +
                '}' + "\n" ;
    }

    private int markWeightValid(){
        if(this.marks == null){
            return -1;
        }

        float totalWeight = 0f;
        for (int key : this.marks.keySet()) {
            totalWeight += this.marks.get(key).getPercntWeight();
        }

        if(totalWeight!= 100f){
            return -1;
        }

        return 0;

    }
    public int checkPass(){
        if(this.marks == null){
            return -1;
        }
        if(this.markWeightValid() == -1){
            return -1;
        }

        float totalPercnt = 0;
        for (int key : this.marks.keySet()) {
            totalPercnt += this.marks.get(key).calcWeightPercnt();
        }

        if(totalPercnt >=50f){
            return 0;
        }

        return -1;
    }
}
