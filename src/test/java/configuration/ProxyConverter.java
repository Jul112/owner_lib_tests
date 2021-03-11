package configuration;

import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class ProxyConverter implements Converter {

    @Override
    public Object convert(Method method, String input) { //String input = value, котю подается на вход (~@DefaultValue from GlobalConfig)
        final String[] data = input.split(":");
        return new Proxy(data[0], Integer.parseInt(data[1]));
        //=нулевой элемент массива data = "proxy.company.com", первый элемент массива String data = "4444" приведен в int
    }

}
