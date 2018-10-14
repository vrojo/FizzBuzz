package FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int value) {
        String answer = "";
        if (isMultiple(value, 3))
            answer += "Fizz";
        if (isMultiple(value, 5))
            answer += "Buzz";
        if (isMultiple(value, 7))
            answer += "Quack";
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