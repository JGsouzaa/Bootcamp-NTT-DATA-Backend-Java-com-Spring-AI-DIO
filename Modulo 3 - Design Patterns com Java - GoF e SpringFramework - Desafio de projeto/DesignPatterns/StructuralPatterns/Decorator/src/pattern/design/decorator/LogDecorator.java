package pattern.design.decorator;

public class LogDecorator implements Notification{
    private Notification notification;

    public LogDecorator(Notification notification){
        this.notification = notification;
    }
    @Override
    public void send(String message){
        System.out.println("Logging notification...");
        notification.send(message);
    }
}
