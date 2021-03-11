package tests;

import com.codeborne.selenide.Configuration;
import configuration.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @BeforeEach
    @Test
    public void initBrowser() {
        final SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class, System.getProperties());
        Configuration.browser = config.browser(); //из RunConfigurtion забираем значение браузера
    }

    @Test
    public void testOpenPage() {
        open("https://github.com");
        //addition checks
    }

    @Test
    public void testSecondPage() {
        open("https://github.com");
        //addition checks
    }
}
