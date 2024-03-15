import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CheckItTest {

    @Test
    public void whenAIsTrue_thenPshouldBeTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void whenBAndCAreTrue_thenPshouldBeTrue() {
        assertTrue(CheckIt.checkIt(false, true, true));
    }

    @Test
    public void whenAIsFalseAndBOrCIsFalse_thenPshouldBeFalse() {
        assertFalse(CheckIt.checkIt(false, false, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void whenAIsTrueAndBAndCAreFalse_thenPshouldBeTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void whenAIsFalseAndBAndCAreTrue_thenPshouldBeTrue() {
        assertTrue(CheckIt.checkIt(false, true, true));
    }
}
