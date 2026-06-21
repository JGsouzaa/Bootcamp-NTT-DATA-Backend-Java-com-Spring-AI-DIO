package patterns.design.bridge;

public class SMS implements Channel{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
