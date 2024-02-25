package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Course;
import za.ac.cput.domain.*;


import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testEqual() {
        Course course1 = new Course("APPDEV", "Application Development", new ArrayList<>());
        Course course2 = new Course("APPDEV","Application Development",new ArrayList<>());
        Person person1 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Person person2 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Student student1 = new Student(course1, person1, 221133445,2024);
        Student student2 = new Student(course2, person2, 221133445,2024);
        assertEquals(student1,student2);
    }
    @Test
    void testNotEqualIdentity(){
        Course course1 = new Course("APPDEV", "Application Development", new ArrayList<>());
        Course course2 = new Course("APPDEV","Application Development",new ArrayList<>());
        Person person1 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Person person2 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Student student1 = new Student(course1, person1, 221133445,2024);
        Student student2 = new Student(course2, person2, 221133445,2024);
        assertNotEquals(student1,student2);
    }

    @Test
    @Timeout(1)
    void testCourseChanges() throws InterruptedException {
        Course course1 = new Course("APPDEV", "Application Development", new ArrayList<>());
        Course course2 = new Course("APPDEV","Application Development",new ArrayList<>());
        Person person1 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Person person2 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Student student = new Student(course1, person1, 221133445,2024);

        Thread.sleep(999);

        student.setRegCourse(course2);
        assertNotEquals(course1, student.getRegCourse());

    }

    @Test
    @Disabled("Disabled until registered courses are changed")
    void testMore() {
        Course course1 = new Course("APPDEV", "Application Development", new ArrayList<>());
        Course course2 = new Course("APPCOM","Application Communication",new ArrayList<>());
        Person person1 = new Person("Jane","Doe","janedoe@gmail.com","j@nedoe11");
        Person person2 = new Person("Jack","Doe","jackdoe@gmail.com","j@ckdoe12");
        Student student1 = new Student(course1, person1, 221133445,2024);
        Student student2 = new Student(course2, person2, 554466778,2024);

        student1.setRegCourse(course2);
        assertEquals(course2, student1.getRegCourse());

        student2.setStudNo(887799101);
        assertEquals(887799101, student2.getStudNo());

        Student student1C = new Student(course1, person1, 221133445,2024);
        assertEquals(student1, student1C);


    }
}
