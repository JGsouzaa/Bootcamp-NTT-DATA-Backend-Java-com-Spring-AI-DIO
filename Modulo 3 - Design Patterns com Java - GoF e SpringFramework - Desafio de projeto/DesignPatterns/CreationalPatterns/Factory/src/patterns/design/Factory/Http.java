package patterns.design.Factory;

public class Http implements Request{
    @Override
    public void sendRequest(String message) {
        System.out.println("Http request sent: " + message);
    }
}
