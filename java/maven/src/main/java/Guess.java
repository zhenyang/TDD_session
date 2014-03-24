public class Guess {
    public String guessNumber(String first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < firstChars.length; i++) {
            for (int j = 0; j < firstChars.length; j++) {
                if (firstChars[i] == secondChars[j]) {
                    if (i == j) {
                        countA++;
                    } else {
                        countB++;
                    }
                }
            }
        }

        return countA + "A" + countB + "B";
    }


}
