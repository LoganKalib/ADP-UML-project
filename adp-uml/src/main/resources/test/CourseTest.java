package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Course;
import za.ac.cput.domain.Mark;
import za.ac.cput.domain.Subject;

import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    private final ConcurrentHashMap<Integer, Subject> subjects = new ConcurrentHashMap<>();
    private final Course course1 = new Course("APDEV","Application development",subjects);
    private final Course course2 = new Course(course1);

    @Test
    void testEqual(){
        assertEquals(course1.getSubjects(),course2.getSubjects());

    }
    @Test
    void testNotEqualIdentity(){
        assertNotEquals(course1,course2);

    }

    @Test
    @Timeout(1)
    void testSubjects() throws InterruptedException {
        Thread.sleep(999);
        ConcurrentHashMap<Integer, Subject> testing = new ConcurrentHashMap<>();
        testing.put(1,new Subject("ADP3","Application development", 2000));

        course1.setSubjects(testing);

        assertNotEquals(course1.getSubjects(),course2.getSubjects());
    }

    @Test
    @Disabled("disable until marks are tested...")
    void testMarks(){
        ConcurrentHashMap<Integer, Mark> marks1 = course1.getSubjects().get(1).getMarks();
        ConcurrentHashMap<Integer, Mark> marks2 = course2.getSubjects().get(1).getMarks();
        assertNotEquals(marks1,marks2);
    }
}
