package patterns.design.bridge;

import javax.management.Notification;

public class TestBridge {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of Bridge is to separate one abstraction to its implementation so both can vary independently

        Channel email = new Email();
        Channel sms = new SMS();
        Channel slack = new Slack();

        BridgeAbstraction notification1 = new NormalNotification(email);
        BridgeAbstraction notification2 = new CriticalNotification(slack);

        notification1.sendMessage("normal notification");
        notification2.sendMessage("critical notification");

        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
