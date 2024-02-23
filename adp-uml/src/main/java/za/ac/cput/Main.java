package za.ac.cput;

import za.ac.cput.domain.*;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("==================================================");

        ConcurrentHashMap<Integer, Subject>  subjects = new ConcurrentHashMap<>();

        subjects.put(1,new Subject("ADP3", "Application development practice", 3000));
        subjects.put(2,new Subject("ITS3", "Application development practice", 2000));
        subjects.put(3,new Subject("ADT3", "Application development theory", 2500));

        System.out.println("Subject created and populated...");

        Course testCourse = new Course("APDEV","Application Development",subjects);

        System.out.println("Course created...");

        Student stud1 = new Student("Tom", "Riddle", "tomRiddle@hogwarts.wiz","TheDarkOne",testCourse, 223245353);

        System.out.println("Student created...");

        Lecturer naidoo = new Lecturer("Kruben", "Naidoo", "programWizard@hogwarts.wiz", "YouShallNotPass",subjects,69420);

        System.out.println("Lecturer created...");

        Mark mark = new Mark("assignment", 100f,0.1f);

        System.out.println("Mark created...");

        naidoo.createMark(subjects.get(1),mark,1);

        System.out.println("Mark added by Naidoo...");
        System.out.println("===============================================================");

        System.out.println(stud1.toString());
        System.out.println("===============================================================");

        Mark newMark = new Mark("assignment", 100f,50f,0.1f);

        naidoo.markStudent(stud1,subjects.get(1),newMark,mark,1);
        System.out.println("Mark updated by naidoo for tom...");
        
        System.out.println("===============================================================");

        System.out.println(stud1.toString());
        System.out.println("===============================================================");
    }
}