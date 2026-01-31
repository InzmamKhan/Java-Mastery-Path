package E_Local_Organization;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🌡️ Temperature Sensor System")
class E_B_DisplayName { // Temprature Test

    @Test
    @DisplayName("Should detect freezing point at 0°C ❄️")
    void testFreezingPoint() {
        int temp = 0;
        assertEquals(0, temp, "Temperature should be exactly zero");
    }

    @Test
    @DisplayName("Should trigger alarm when temp is above 100°C 🔥")
    void testBoilingPointAlarm() {
        int temp = 105;
        boolean alarm = (temp > 100);
        assertTrue(alarm, "Alarm should be active");
    }

    @Test
    @DisplayName("Should report 'Normal' for room temperature (22°C) ✅")
    void testRoomTemp() {
        int temp = 22;
        assertTrue(temp > 18 && temp < 25);
    }
}