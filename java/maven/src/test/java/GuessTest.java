import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GuessTest {

    private Guess guess;

    @Before
    public void setUp() throws Exception {
        guess = new Guess();
    }

    @Test
    public void testShouldGet0A0BWhenTwoNumberTotallyDifferent() throws Exception {

        String result = guess.guessNumber("1234", "5678");

        assertThat(result, is("0A0B"));
    }

    @Test
    public void testShouldGet1A0BWhenOneNumberIsSamePositionAndSameValue() throws Exception {

        String result = guess.guessNumber("1234", "1678");

        assertThat(result, is("1A0B"));
    }

    @Test
    public void testShouldGet1A0BWhenOneNumberIsSamePositionAndSameValueAtSecondPosition() throws Exception {

        String result = guess.guessNumber("1234", "6278");

        assertThat(result, is("1A0B"));
    }

    @Test
    public void testShouldGet1A0BWhenOneNumberIsSamePositionAndSameValueAtThirdPosition() throws Exception {

        String result = guess.guessNumber("1234", "6738");

        assertThat(result, is("1A0B"));
    }

    @Test
    public void testShouldGet1A0BWhenOneNumberIsSamePositionAndSameValueAtFourthPosition() throws Exception {

        String result = guess.guessNumber("1234", "6784");

        assertThat(result, is("1A0B"));
    }

    @Test
    public void testShouldGet2A0BWhenTwoNumberIsSamePositionAndSameValueAtFirstKindOfPostion() throws Exception {

        String result = guess.guessNumber("1234", "1256");
        assertThat(result, is("2A0B"));
    }

    @Test
    public void testShouldGet0A1BWhenOneNumberIsDifferentPositionAndSameValueAtFirstPostion() throws Exception {

        String result = guess.guessNumber("1234", "5167");
        assertThat(result, is("0A1B"));
    }

    @Test
    public void testShouldGet1A2B() throws Exception {
        String result = guess.guessNumber("1234", "2164");
        assertThat(result, is("1A2B"));
    }

    @Test
    public void testGetFourDigitsString() throws Exception {
        String number = new RandomGenerator().generateRandomNumber();
        String regex = "[0-9][0-9][0-9][0-9]";

        assertThat(number.matches(regex), is(true));
    }

    @Test
    public void testGetFourDifferentDigitsString() throws Exception {
        String number = new RandomGenerator().generateRandomNumber();

        assertThat(allDigitsDifferent(number), is(true));
    }

    private Boolean allDigitsDifferent(String number) {
        char[] chars = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j < number.length(); j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

