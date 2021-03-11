package tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SystemPropertyTest {

    @Test
    public void testSystemProperty() {
        assertThat(System.getProperty("browser")).isEqualTo("firefox");

    }
}
