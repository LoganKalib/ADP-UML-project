package za.ac.cput;
//222641495

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeAll;
import za.ac.cput.domain.Lecturer;

import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest {
    private static Lecturer lecturer1;
    private static Lecturer lecturer2;
    private static Lecturer lecturer3;

    @BeforeAll
    static void setUp() {
        // Set up initial data for testing
        lecturer1 = new Lecturer("Kruben", "Naidoo", "naidook@cput.ac.za", "password", null, 12345);
        lecturer2 = new Lecturer("Radford", "Burger", "burger@cput.ac.za", "p@ssword", null, 1245);
        lecturer3 = lecturer1; // Create a copy of lecturer1
    }

    // Test for object equality
    @Test
    void testEqual() {
        assertEquals(lecturer1, lecturer3); // Expecting lecturer1 and lecturer3 to be equal
    }

    // Test for object identity
    @Test
    void testIdentity() {
        assertNotSame(lecturer1, lecturer2); // Expecting lecturer1 and lecturer2 to be different objects
    }

    // Failing test to demonstrate assertFalse
    @Test
    void failingTest() {
        assertNotSame(lecturer1, lecturer2); // Expecting lecturer1 and lecturer2 to be different objects
    }

    // Test for performance with a timeout
    @Test
    @Timeout(1)
    void testPerformance() throws InterruptedException {
        System.out.println("Starting performance test...");
        Thread.sleep(1000); // Wait for 1000 milliseconds (1 second)
        System.out.println("Performance test completed successfully within the timeout.");
    }

    // Test that is disabled
    @Disabled
    @Test
    void testDisabledScenario() {
        // Given: a lecturer object
        Lecturer lecturer = new Lecturer("Jason", "Mamoa", "jasonmamoa@gmail.com", "password", null, 12345);
        // Then: verify that the subjects they teach is null
        assertNull(lecturer.getSubsTaught());
    }
}