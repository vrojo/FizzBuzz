package FizzBuzz;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number(){
        assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_when_multiple_of_3(){
        assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_multiple_of_5(){
        assertThat(FizzBuzz.fizzBuzz(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_when_multiple_of_3_and_5(){
        assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzz_when_multiple_of_3_and_5_2(){
        assertThat(FizzBuzz.fizzBuzz(30)).isEqualTo("FizzBuzz");
    }
}