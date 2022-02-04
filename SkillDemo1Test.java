import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void testZeroPowerZero() {
        boolean exceptionCaught = false;
        try {
            int result = SkillDemo1.exponent(0, 0);
        } catch (IllegalArgumentException e) {
            exceptionCaught = true;
        }
        assertTrue("Caught 0^0 :", exceptionCaught);
    }
}
