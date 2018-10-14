package FizzBuzz;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number(){
        assertThat(FizzBuzz.ShowNumber(1)).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_when_multiple_of_3(){
        assertThat(FizzBuzz.ShowNumber(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_corresponding_number5(){
        assertThat(FizzBuzz.ShowNumber(5)).isEqualTo("Buzz");
    }
}