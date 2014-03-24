import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public String generateRandomNumber() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            numbers = getNumber(10, numbers);
        }
        String result = "";
        for (Integer number : numbers) {
            result += number.toString();
        }
        return result;
    }

    private List<Integer> getNumber(int range, List<Integer> numbers) {
        Integer i = new Random().nextInt(range);
        while (numbers.contains(i)) {
            i = new Random().nextInt(range);
        }
        numbers.add(i);
        return numbers;
    }
}
