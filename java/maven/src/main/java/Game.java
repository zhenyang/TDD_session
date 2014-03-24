public class Game {

    private final Guess guess;
    private String randomNumber;

    public Game(RandomGenerator randomGenerator, Guess guess) {
        this.guess = guess;
        this.randomNumber = randomGenerator.generateRandomNumber();
    }

    public String play(String s) {
        System.out.println("randomNumber: "+ randomNumber);
        System.out.println("guess: "+ s);
        return guess.guessNumber(s, randomNumber);
    }


}
