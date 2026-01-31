package C_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class C_E_Testing_Timeouts {

    @Test
    void testPerformance() {
        // This test fails if the code inside takes longer than 2 seconds
        assertTimeout(Duration.ofSeconds(2), () -> {
            // Simulate a task (like a DB call) that takes 1 second
            Thread.sleep(1000); 
            System.out.println("Finished on time!");
        });
    }

    @Test
    void testQuickTask() {
        // Using Milliseconds for very fast code
        assertTimeout(Duration.ofMillis(100), () -> {
            int x = 1 + 1;
        });
    }
}