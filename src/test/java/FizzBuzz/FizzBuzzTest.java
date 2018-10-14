package FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number(){
        Assertions.assertThat(FizzBuzz.ShowNumber(1)).isEqualTo("1");
    }

    @Test
    public void should_return_corresponding_number2(){
        Assertions.assertThat(FizzBuzz.ShowNumber(2)).isEqualTo("2");
    }

    @Test
    public void should_return_corresponding_number4(){
        Assertions.assertThat(FizzBuzz.ShowNumber(4)).isEqualTo("4");
    }
}