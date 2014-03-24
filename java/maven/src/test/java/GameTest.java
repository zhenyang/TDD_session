import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game(new RandomGenerator(), new Guess());
    }

    @Test
    public void testGame() throws Exception {
        String result = game.play("2345");
        System.out.println(result);
    }

    @Test
    public void testUnit() throws Exception {
        RandomGenerator randomGenerator = mock(RandomGenerator.class);
        when(randomGenerator.generateRandomNumber()).thenReturn("1234");

        Guess guess = mock(Guess.class);
        when(guess.guessNumber("5678", "1234")).thenReturn("0A0B");

        game = new Game(randomGenerator, guess);

        assertThat(game.play("5678"), is("0A0B"));
    }
}
