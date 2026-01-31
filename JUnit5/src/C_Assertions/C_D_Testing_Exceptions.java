package C_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class C_D_Testing_Exceptions {

    @Test
    void testDivisionByZero() {
        // We expect an ArithmeticException to be thrown
        // The lambda () -> ... contains the code that should crash
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });

        // You can verify the specific error message inside the exception
        assertEquals("/ by zero", exception.getMessage());
    }
    
    @Test
    void testNullPointer() {
        String str = null;
        
        assertThrows(NullPointerException.class, () -> {
            str.length();
        });
    }
}