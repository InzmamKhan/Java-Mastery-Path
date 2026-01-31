package D_Parameterized_Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class D_C_Method_Source {

    @ParameterizedTest(name = "Test {index}: Input ''{0}'' should have length {1}")
    @MethodSource("stringAndLengthProvider")
    void testStringLength(String input, int expectedLength) {
        assertNotNull(input);
        assertEquals(expectedLength, input.length());
    }

    // This is the "Factory Method" that provides the data
    // It MUST be static
    static Stream<Arguments> stringAndLengthProvider() {
        return Stream.of(
            Arguments.of("apple", 5),
            Arguments.of("banana", 6),
            Arguments.of("JUnit5", 6),
            Arguments.of("", 0)
        );
    }
}