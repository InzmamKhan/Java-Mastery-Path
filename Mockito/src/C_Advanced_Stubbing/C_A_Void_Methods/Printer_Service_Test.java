package Advanced_Stubbing.Void_Methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Printer_Service_Test {

    @Mock
    Printer printer;

    @InjectMocks
    Printer_Service service;

    @Test
    void test(){
        doThrow(new RuntimeException("Out of Ink")).when(printer).print(anyString());

        try {
            service.do_job("Hello");
        }
        catch (RuntimeException e) {
            assertEquals("Out of Ink", e.getMessage());
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}