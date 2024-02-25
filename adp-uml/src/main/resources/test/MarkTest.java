import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeAll;
import za.ac.cput.domain.Mark;

import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

public class MarkTest {
    private static Mark mark1;
    private static Mark mark2;
    private static Mark mark3;

    @BeforeAll
    static void setUp(){
        mark1 = new Mark(50, 40, "ADP June Exam", "Test");
        mark2 = mark1;
        mark3 = new Mark(50, 40, "ADP June Exam", "Test");
    }

    @Test
    void testEqual(){
        assertEquals(mark1, mark2);
    }

    @Test
    void testEqualIdentity(){
        assertTrue(mark1 == mark2);
    }

    @Test
    void failingTest(){
        assertTrue(mark1 == mark3);
    }

    @Test
    @Timeout(1)
    void testMarks() throws TimeoutException, InterruptedException {
        Thread.sleep(1001);
    }

    @Test
    @Disabled
    void testDisabled() {
        mark1 = new Mark(70, "ITS Exam", "Test");
    }


}