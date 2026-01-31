package C_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class C_B_Core_Assertions {

    C_A_Sample_Program prog = new C_A_Sample_Program();

    @Test
    void testAddition_A() {
        int result = prog.add(2, 2);
        int expected = 4;
        assertEquals(expected, result, "Should Pass");
    }

    @Test
    void testAddition_B() {
        int result = prog.add(2, 2);
        int expected = 4;
        assertNotEquals(expected, result, "Should Fail");
    }

    @Test
    void testAddition_C() {
        int result = prog.add(2, 2);
        assertTrue(result == 4, "Should Pass");
    }

    @Test
    void testAddition_D() {
        int result = prog.add(2, 2);
        assertFalse(result == 4, "Should Fail");
    }
}