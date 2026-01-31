package Advanced_Stubbing.Custom_Answer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Speaker_Service_Test {
    
    @Mock
    Speaker speaker;

    @InjectMocks
    Speaker_Service speaker_Service;
 
    @Test
    void test() {
        // 1. Setup the behavior
        when(speaker.speak(anyString())).thenAnswer(invocation -> {
        String input = invocation.getArgument(0);
        return input + " " + input;
        });
        // 2. Call the method (just pass "Hello")
        String result = speaker_Service.try_speak("Hello");

        // 3. Compare the result
        assertEquals("Hello Hello", result);
    }
}