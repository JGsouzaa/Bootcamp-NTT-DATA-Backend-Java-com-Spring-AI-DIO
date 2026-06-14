package patterns.design.abstractfactory;

public class MttqResponse implements Response{

    @Override
    public void handleResponse(String message) {
        System.out.println("Mttq Response: " + message);
    }
}
