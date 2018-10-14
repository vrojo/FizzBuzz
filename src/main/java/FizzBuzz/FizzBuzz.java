package FizzBuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FizzBuzz {
    public static String fizzBuzz(int value) {
        Map<Integer, String> multiples = new HashMap<Integer, String>();
        multiples.put(3, "Fizz");
        multiples.put(5, "Buzz");
        multiples.put(7, "Quack");
        String answer = multiples.entrySet().stream()
                .filter(e -> isMultiple(value, e.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());
        if (!answer.equals(""))
            return answer;
        return "" + value;
    }

    private static boolean isMultiple(int value, int multipliedNbr) {
        if (value % multipliedNbr == 0)
            return true;
        return false;
    }

    public static void main(String arg[]){
        for (int number=1; number<=100; number++){
            System.out.println(fizzBuzz(number));
        }
    }
}