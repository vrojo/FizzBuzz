package FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_corresponding_number(){
        Assertions.assertThat(FizzBuzz.ShowNumber(1)).isEqualTo("1");
    }
}