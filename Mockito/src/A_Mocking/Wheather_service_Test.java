package A_Mocking;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class Wheather_service_Test {

    // Mockito fakes the entire class/Interface !
    @Mock
    Temp_Sensor sensor;

    // Plugs the fake sensor into the service
    @InjectMocks
    Wheather_service service;

    @Test
    void test(){
        // STUBBING: Even though TemperatureSensor is a real class, 
        // we force it to return 25.
        when(sensor.get_temp()).thenReturn(25);

        String advice = service.get_advice();

        assertEquals("Hot", advice);
    }
}