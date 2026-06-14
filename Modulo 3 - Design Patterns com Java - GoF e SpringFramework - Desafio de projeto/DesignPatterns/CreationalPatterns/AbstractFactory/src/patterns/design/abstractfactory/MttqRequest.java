package patterns.design.abstractfactory;

public class MttqRequest implements Request{
    @Override
    public void sendRequest(String message) {
        System.out.println("Mqtt request sent: " + message);

    }
}
