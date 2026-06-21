package patterns.design.bridge;

public class Slack implements Channel{

    @Override
    public void sendMessage(String message) {
        System.out.println("Slack: " + message);
    }
}
