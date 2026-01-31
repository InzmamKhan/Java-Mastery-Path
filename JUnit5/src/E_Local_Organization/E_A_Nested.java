package E_Local_Organization;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

class E_A_Nested { // LightBulb Test

    boolean isOn;

    @Nested
    class WhenSwitchIsOff {

        @BeforeEach
        void setOff() {
            isOn = false;
        }

        @Test
        void lightIsActuallyOff() {
            assertFalse(isOn);
        }

        @Test
        void flippingSwitchTurnsItOn() {
            isOn = true; // Simulating flipping the switch
            assertTrue(isOn);
        }
    }

    @Nested
    class WhenSwitchIsOn {

        @BeforeEach
        void setOn() {
            isOn = true;
        }

        @Test
        void lightIsActuallyOn() {
            assertTrue(isOn);
        }

        @Test
        void flippingSwitchTurnsItOff() {
            isOn = false; // Simulating flipping the switch
            assertFalse(isOn);
        }
    }
}