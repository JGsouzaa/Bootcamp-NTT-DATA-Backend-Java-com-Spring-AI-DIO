package patterns.design.abstractfactory;

public class TestAbstractFactory {

    public static void main() {
        System.out.println(test());
    }
    public static String test(){


        //The abstract factory is the same as factory but with more products, abstracting the creation of those

        //without factory
        HttpRequest httpreq = new HttpRequest();
        HttpResponse httpresp = new HttpResponse();

        MttqRequest mttqreq = new MttqRequest();
        MttqResponse mttqresp = new MttqResponse();

        httpreq.sendRequest("Ping without factory request");
        httpresp.handleResponse("Pong without factory response");

        mttqreq.sendRequest("Ping without factory request");
        mttqresp.handleResponse("Ponog without factory response");

        //with factory
        ComunicationFactory factory_http = new AbstractHttpFactory();
        ComunicationClient factory_http_client = new ComunicationClient(factory_http);

        factory_http_client.execute();


        ComunicationFactory factory_mttq = new AbstractMttqFactory();
        ComunicationClient factory_mttq_client = new ComunicationClient(factory_mttq);

        factory_mttq_client.execute();
        /*

        if ((factory_mqtt instanceof Mqtt) && (factory_http instanceof Http)) {
            return "OK";
        } else{
            return "FAILED!";
        }*/
        return("test");
    }

}
