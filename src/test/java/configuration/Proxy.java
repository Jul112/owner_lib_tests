package configuration;

public class Proxy {

    public String host;
    public int port;
    //public boolean enabled; убрали для упрощения примера

    public Proxy(final String host, final int port){
        this.host = host;
        this.port = port;
       // this.enabled = enabled;
    }
}
