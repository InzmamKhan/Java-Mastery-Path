package C_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class C_C_Grouped_Assertions {

    @Test
    void testUserObject() {
        // Data to test
        String firstName = "John";
        String lastName = "Doe";
        int age = 25;

        // Grouping ensures we see ALL failures if they happen
        assertAll("Verify User Details",
            () -> assertEquals("John", firstName, "First name is wrong"),
            () -> assertEquals("Doe", lastName, "Last name is wrong"),
            () -> assertTrue(age >= 18, "User must be an adult")
        );
    }
}