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
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void whenPisFalse_thenAshouldBeFalse() {
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void whenAisFalse_thenBAndCshouldNotBothBeTrue() {
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, false, true));

    }

    @Test
    public void whenAisTrue_thenPisAlwaysTrue() {
        assertTrue(CheckIt.checkIt(true, true, true));
        assertTrue(CheckIt.checkIt(true, true, false));
        assertTrue(CheckIt.checkIt(true, false, true));
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void whenPisFalse_thenEitherAisFalseOrBAndCareNotBothTrue() {
        assertFalse(CheckIt.checkIt(false, false, true));
        assertFalse(CheckIt.checkIt(false, true, false));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

}
