package FizzBuzz;

import org.junit.Test;

import static FizzBuzz.FizzBuzz.fizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number(){
        assertThat(fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void should_say_Fizz_when_multiple_of_3(){
        assertThat(fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_say_Buzz_when_multiple_of_5(){
        assertThat(fizzBuzz(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_say_Quack_when_multiple_of_7() {
        assertThat(fizzBuzz(7)).isEqualTo("Quack");
    }

    @Test
    public void should_say_FizzBuzz_when_multiple_of_3_and_5(){
        assertThat(fizzBuzz(15)).isEqualTo("FizzBuzz");
    }
}