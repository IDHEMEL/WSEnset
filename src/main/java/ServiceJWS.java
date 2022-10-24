import ws.BankService;

import javax.xml.ws.Endpoint;

public class ServiceJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8085/", new BankService());
        System.out.println("Service started");
    }
}
