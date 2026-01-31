package B_Spying;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Calc_Spy {

    @Spy
    Calculator calc;

    @Test
    // 1. CALL REAL METHOD
    // Since it's a Spy, it uses the actual 'add' code.
    void normal_test(){
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    // 2. STUB A SPECIFIC METHOD (The "Partial" part)
    // We tell the spy: "For multiply, don't be real. Just return 100."
    // Note: With Spies, we use doReturn() to avoid calling the real method during setup
    void Spy_Test(){
        doReturn(10000).when(calc).add(6, 4);
        assertNotEquals(10, calc.add(6, 4));
    }
}