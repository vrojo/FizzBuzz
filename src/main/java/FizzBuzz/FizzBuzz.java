package FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int value) {
        String answer = "";
        if (value % 3 == 0)
            answer += "Fizz";
        if (value % 5 == 0)
            answer += "Buzz";
        if (value % 7 == 0)
            answer += "Quack";
        if (!answer.equals(""))
            return answer;
        return "" + value;
    }

    public static void main(String arg[]){
        for (int number=1; number<=100; number++){
            System.out.println(fizzBuzz(number));
        }
    }
}