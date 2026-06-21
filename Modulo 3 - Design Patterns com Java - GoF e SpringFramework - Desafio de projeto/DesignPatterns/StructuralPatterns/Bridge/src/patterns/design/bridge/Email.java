package patterns.design.bridge;

public class Email implements Channel{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
