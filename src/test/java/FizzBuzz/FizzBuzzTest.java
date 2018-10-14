package FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number1(){
        Assertions.assertThat(FizzBuzz.ShowNumber(1)).isEqualTo("1");
    }

    @Test
    public void should_return_corresponding_number2(){
        Assertions.assertThat(FizzBuzz.ShowNumber(2)).isEqualTo("2");
    }

    @Test
    public void should_return_corresponding_number3(){
        Assertions.assertThat(FizzBuzz.ShowNumber(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_corresponding_number4(){
        Assertions.assertThat(FizzBuzz.ShowNumber(4)).isEqualTo("4");
    }

    @Test
    public void should_return_corresponding_number5(){
        Assertions.assertThat(FizzBuzz.ShowNumber(5)).isEqualTo("Buzz");
    }
}