package za.ac.cput;

import za.ac.cput.domain.*;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------------------------------------------------------------");

        ConcurrentHashMap<Integer, Subject> subjects = new ConcurrentHashMap<>();
        subjects.put(1,new Subject("ADP3","Application development practice",3000));
        subjects.put(2,new Subject("ADT3","Application development theory",3000));
        subjects.put(3,new Subject("ITS3","Information systems",3000));

        System.out.println("Subjects created...");
        System.out.println("--------------------------------------------------------------------");

        Course course1 = new Course("APDEV","Application Development",subjects);
        Course course2 = new Course(course1);

        Student stud1 = new Student("Tom","Riddle","tomRiddle@hogwarts.wiz","TheDarkOne",course1,22453930);
        Student stud2 = new Student("Harry", "Potter", "harryPotter@hogwarts.wiz", "YouAWizard",course2,1655353);

        System.out.println("Courses and students created...");
        System.out.println("--------------------------------------------------------------------");

        System.out.println(stud1);
        System.out.println(stud2);

        System.out.println("--------------------------------------------------------------------");

        Lecturer lec1 = new Lecturer("Kruben","Naidoo","krubenNaidoo@hogwarts.wiz","YouShallNotPass",subjects,3154556);

        Mark mark1 = new Mark("Test",100,10);
        Mark mark2 = new Mark("Assignment",100,10);

        System.out.println("Lecturer and mark created...");

        System.out.println(lec1.createMark(subjects.get(2),mark1,2));
        System.out.println(lec1.createMark(subjects.get(2),mark2,3));

        System.out.println("Global mark added...");
        System.out.println("--------------------------------------------------------------------");

        System.out.println(stud1);
        System.out.println(stud2);
        if(stud1.getRegCourse().getSubjects().equals(stud2.getRegCourse().getSubjects())){
            System.out.println("why they so equal");
        }
    }
}