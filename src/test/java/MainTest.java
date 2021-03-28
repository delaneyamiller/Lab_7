

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {


   
    @org.junit.jupiter.api.Test
    public void testMain() throws InvalidAgeException {
        System.out.println("main");
        String[] args = null;
        Main.main(args);        
    }

    
    @org.junit.jupiter.api.Test
    public void testCalculateLifeInsurance() {
        System.out.println("calculateLifeInsurance");
        int age = 30;
        double expResult = 450.0;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result, 450.0);
    }
    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.InvalidAgeException();
        });
    }
    
}
