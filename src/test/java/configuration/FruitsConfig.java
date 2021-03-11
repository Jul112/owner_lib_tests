package configuration;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("fruits")
    @Separator(",")
    @DefaultValue("banana, apple, orange")
    List<String> getFruits();
}
