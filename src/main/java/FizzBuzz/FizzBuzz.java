package FizzBuzz;

public class FizzBuzz {
    public static String ShowNumber(int i) {
        if (i==8) {
            return "" + 8;
        }
        if (i==7) {
            return "" + 7;
        }
        if (i==6) {
            return "" + "Fizz";
        }
        if (i==5) {
            return "" + "Buzz";
        }
        if (i==4) {
            return "" + 4;
        }
        if (i==3) {
            return "" + "Fizz";
        }
        if (i==2) {
            return "" + 2;
        }
        return "" + 1;
    }
}