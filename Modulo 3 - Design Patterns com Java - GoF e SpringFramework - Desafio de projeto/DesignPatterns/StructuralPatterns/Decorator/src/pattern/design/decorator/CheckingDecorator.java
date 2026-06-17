package pattern.design.decorator;

import org.w3c.dom.traversal.NodeIterator;

public class CheckingDecorator implements Notification{

    private Notification notification;

    public CheckingDecorator(Notification notification) {
        this.notification = notification;
    }


    @Override
    public void send(String message) {
        notification.send(message);
        System.out.println("Checking...");
    }
}
