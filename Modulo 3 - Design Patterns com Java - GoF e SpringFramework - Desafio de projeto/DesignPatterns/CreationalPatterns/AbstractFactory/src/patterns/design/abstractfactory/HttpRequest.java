package patterns.design.abstractfactory;

public class HttpRequest implements Request{
    @Override
    public void sendRequest(String message) {

        System.out.println("Http request sent: " + message);
    }
}
