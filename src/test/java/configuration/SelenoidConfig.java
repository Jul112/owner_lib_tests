package configuration;

import org.aeonbits.owner.Config;

public interface SelenoidConfig extends Config {

    @Key("browser")
    String browser();
}
