import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloWorldTest {

    @Test
    public void arithmeticTest() {
        assertThat(1 + 1, equalTo(2));
    }

}
