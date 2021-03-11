package configuration;

import org.aeonbits.owner.Config;

public interface ReturnTypesConfig extends Config {

    @Key("double")
    double getDouble();

    @Key("int")
    int getInt();

    @Key("boolean")
    boolean getBoolean();

    @Key("string")
    String getString();

    @Key("long")
    long getLong();


}
