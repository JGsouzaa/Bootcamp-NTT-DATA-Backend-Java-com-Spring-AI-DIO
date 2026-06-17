package pattern.design.decorator;

public class TestDecorator {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of Decorator is to insert new responsabilities to an object without changing it's original form

        Notification notification = new CheckingDecorator(new LogDecorator(new EmailNotification()));

        notification.send("New sending");
        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
