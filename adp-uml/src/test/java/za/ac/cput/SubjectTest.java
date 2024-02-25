package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Mark;
import za.ac.cput.domain.Subject;

import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SubjectTest {
    private final ConcurrentHashMap<Integer, Mark> marks = new ConcurrentHashMap<>();
    private final Subject subject1 = new Subject("ITS","Information Systems",2654);
    private final Subject subject2 = new Subject(subject1);

    @Test
    void testEqual(){
        assertEquals(subject1.getSubjectCode(),subject2.getSubjectCode());

    }
    @Test
    void testNotEqualIdentity(){
        assertNotEquals(subject1.getMarks(),subject2.getMarks());

    }

    @Test
    @Timeout(1)
    void testMarks() throws InterruptedException {
        Thread.sleep(999);
        ConcurrentHashMap<Integer, Mark> testing = new ConcurrentHashMap<>();
        testing.put(1,new Mark("ITS3", 100, 87));

        subject1.setMarks(testing);

        assertNotEquals(subject1.getMarks(),subject2.getMarks());
    }

    @Test
    @Disabled("disable until lecturer are tested...")
    void testLecturer(){
        ConcurrentHashMap<Integer, Subject> subjects1 = new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer, Subject> subjects2 = new ConcurrentHashMap<>();
        assertNotEquals(subjects1,subjects2);
    }
}
