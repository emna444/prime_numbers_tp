import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {
    PrimeChecker PrimeChecker = new PrimeChecker();
@Test
   public void test0IsNotPrime(){
         assertFalse(PrimeChecker.isPrime(0), "0 should not be prime");
   }


}
