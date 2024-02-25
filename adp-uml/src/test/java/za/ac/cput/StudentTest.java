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

    Course course1 = new Course("APPDEV", "Application Development", new ConcurrentHashMap<>());
    Course course2 = new Course(course1);
    Student student1 = new Student("Jane","Doe","janedoe@gmail.com","j@nedoe11",course1,32121535);
    Student student2 = new Student("John", "Doe","johndoe@gmail.com","j@hnDoe44",course2,5315453);

    @Test
    void testEqual() {
        assertEquals(student1.getRegCourse(),student2.getRegCourse());
    }
    @Test
    void testNotEqualIdentity(){
        assertNotEquals(student1.getStuNumber(),student2.getStuNumber());
    }

    @Test
    @Timeout(1)
    void testCourseChanges() throws InterruptedException {
        Thread.sleep(999);

        student1.setRegCourse(course2);
        assertNotEquals(course1, student2.getRegCourse());

    }

    @Test
    @Disabled("Disabled until registered courses are changed")
    void testMore() {

        student1.setRegCourse(course2);
        assertEquals(course2, student1.getRegCourse());

        student2.setStuNumber(887799101);
        assertEquals(887799101, student2.getStuNumber());

        assertEquals(student1, student2);


    }
}
