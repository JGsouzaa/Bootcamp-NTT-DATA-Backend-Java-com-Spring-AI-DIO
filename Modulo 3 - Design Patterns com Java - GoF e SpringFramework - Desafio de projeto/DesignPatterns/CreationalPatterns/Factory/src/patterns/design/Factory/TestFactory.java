package patterns.design.Factory;

public class TestFactory {
    public static void main() {
        System.out.println(test());
    }
    public static String test(){

        //The idea behind factory is to abstract the creation of objects, so you don't need to specify the instance you
        //are creating

        //without factory
        Http httprequest = new Http();
        Mqtt mqttrequest = new Mqtt();

        httprequest.sendRequest("regular http");
        mqttrequest.sendRequest("regular mqtt");

        //with factory
        Request factory_http = Factory.createHttp();
        factory_http.sendRequest("factory http");

        Request factory_mqtt = Factory.createMqtt();
        factory_mqtt.sendRequest("factory mqtt");


        if ((factory_mqtt instanceof Mqtt) && (factory_http instanceof Http)) {
            return "OK";
        } else{
            return "FAILED!";
        }
    }
}
