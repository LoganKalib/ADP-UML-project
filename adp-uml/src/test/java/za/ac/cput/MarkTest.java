package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeAll;
import za.ac.cput.domain.Mark;

import static org.junit.jupiter.api.Assertions.*;

public class MarkTest {
    private static Mark mark1;
    private static Mark mark2;
    private static Mark mark3;

    @BeforeAll
    static void setUp(){
        mark1 = new Mark("Test", 40, 10);
        mark2 = mark1;
        mark3 = new Mark("Assignment", 40, 32, 30);
    }

    @Test
    void testEqual(){
        assertEquals(mark1, mark3);
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
    void testMarks() throws InterruptedException {
        Thread.sleep(1001);
    }

    @Test
    @Disabled
    void testDisabled() {
        mark1 = new Mark("Test", 200, 30);
    }


} 