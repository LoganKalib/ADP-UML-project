package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Person;

import static org.junit.jupiter.api.Assertions.*;
/* Sheldon Luke Arendse
    221190384
 */
class PersonTest {
    private final Person person1 = new Person("Sheldon", "Arendse", "sheldon.arendse@gmail.com", "shhPwd#7");
    private final Person person2 = person1;
    private final Person person3 = new Person("Logan", "Coghill", "logan.coghill@hotmail.com", "wh01sLog@n");

    // Creating a test method to fail
    @Test
    void testExpectingFailure() {
        assertNull(person1, "Person1 is not Null");
    }

    // Disabling this test method because it will fail
    @Disabled
    @Test
    void testIfPerson1NameEqualsPerson3Name() {
        assertEquals(person1.getName(), person3.getName());
    }

    // Checking if person1 email is the same as person2 email
    @Test
    void testIfPerson1EmailEqualsPerson2Email() {
        assertEquals(person1.getEmail(), person2.getEmail());
        System.out.println("\nAssert Equals" +
                "\n--------------\n" +
                "Person1 Email: " + person1.getEmail() +
                "\nPerson2 Email: " + person2.getEmail());
    }

    // Ensuring that person1 does NOT equal person3
    @Test
    void tesIfPerson1NotEqualsPerson3() {
        assertNotEquals(person1, person3);
        System.out.println("\nAssert Not Equals" +
                "\n------------------" +
                "\nPerson1: " + person1 +
                "\nPerson3: " + person3);
    }

    // Identifying if person1 is the same instance of person2
    @Test
    void testIfPerson1isAnInstanceOfPerson2() {
        assertSame(person1, person2);
        System.out.println("\nAssert Same" +
                "\n----------------\n" +
                person1 + "\n" +
                person2);
    }

    // Using Timeouts
    @Test
    @Timeout(3)
    void testTimeout() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("""
                Test Timeout
                -------------------
                Timeout for 3 seconds completed...""");
    }
}