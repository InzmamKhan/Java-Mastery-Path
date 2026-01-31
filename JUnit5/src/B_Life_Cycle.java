import org.junit.jupiter.api.*;

class B_Life_Cycle{

    @BeforeAll
    static void testa(){
        System.out.println("Performed @BeforeAll");
    }

    @BeforeEach
    void testb(){
        System.out.println("Performed @BeforeEach");
    }

    @Test
    void testc(){
        System.out.println("Performed Actual Test A");
    }

    @AfterEach
    void testd(){
        System.out.println("Performed @AfterEach");
    }

    @BeforeEach
    void teste(){
        System.out.println("Performed @BeforeEach");
    }

    @Test
    void testf(){
        System.out.println("Performed Actual Test B");
    }

    @AfterEach
    void testg(){
        System.out.println("Performed @AfterEach");
    }

    static @AfterAll
    void testh(){
        System.out.println("Performed @AfterAll");
    }
}