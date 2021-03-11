package tests;

import configuration.TestConfig;
import configuration.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        /*final String localWebDriverUrl = "http://localhost:4444"; //selenoid port 8080
        final String companyWebDriverUrl = "http://selenoid.company.com:4444"; //remote webdriver
        final String webDriverBrowserChrome = "chrome";
        final String webDriverBrowserFirefox = "firefox";
        final String baseUrlTesting = "https://testing.github.com";
        final String baseUrlDev = "https://dev.github.com";*/

        assertThat(config.getWebDriverUrl()).isEqualTo("http://localhost:4444");
        assertThat(config.getWebDriverBrowser()).isEqualTo("chrome");
        assertThat(config.getBaseUrl()).isEqualTo("https://testing.github.com");
        assertThat(config.isEnabled()).isEqualTo(true);
    }
}
