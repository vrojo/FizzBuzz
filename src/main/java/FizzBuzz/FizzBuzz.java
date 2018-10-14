package FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (i%3==0 && i%5==0){
            return "" + "FizzBuzz";
        }
        if (i%5==0) {
            return "" + "Buzz";
        }
        if (i%3==0) {
            return "" + "Fizz";
        }
        return "" + i;
    }

    public static void main(String arg[]){
        for (int number=1; number<=100; number++){
            System.out.println(fizzBuzz(number));
        }
    }
}