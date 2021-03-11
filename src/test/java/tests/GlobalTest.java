package tests;

import configuration.GlobalConfig;
import configuration.Proxy;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GlobalTest {

    @Test
    public void testConfig() {
        final GlobalConfig config = ConfigFactory.create(GlobalConfig.class, System.getProperties());

        final Proxy proxy = config.getProxy();
        assertThat(proxy.host).isEqualTo("proxy.company.com");
        assertThat(proxy.port).isEqualTo(4444);
    }
}
