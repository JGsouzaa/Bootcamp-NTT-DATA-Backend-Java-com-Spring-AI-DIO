package patterns.design.Factory;

public class Mqtt implements Request{
    @Override
    public void sendRequest(String message) {
        System.out.println("Mqtt request sent: " + message);
    }
}
