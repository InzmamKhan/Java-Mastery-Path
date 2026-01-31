package D_Parameterized_Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class D_B_Csv_Source {

    @ParameterizedTest(name = "Test {index}: {0} + {1} should be {2}")
    @CsvSource({
        "5,   5,   10",
        "10,  20,  30",
        "100, 200, 300"
    })
    void testAddition(int num1, int num2, int expectedSum) {
        assertEquals(expectedSum, num1 + num2, "The sum calculation is wrong!");
    }
}