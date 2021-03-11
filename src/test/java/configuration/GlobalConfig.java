package configuration;

import org.aeonbits.owner.Config;

public interface GlobalConfig extends Config {

    @Key("proxy")
    @ConverterClass(ProxyConverter.class)//чтобы преобразовать строку(@DefaultValue) в Proxy
    @DefaultValue("proxy.company.com:4444")
    Proxy getProxy();

}
