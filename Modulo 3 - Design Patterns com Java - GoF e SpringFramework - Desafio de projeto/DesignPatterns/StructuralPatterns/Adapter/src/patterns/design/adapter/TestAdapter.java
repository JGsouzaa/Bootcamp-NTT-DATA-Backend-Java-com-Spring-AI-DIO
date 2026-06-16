package patterns.design.adapter;

public class TestAdapter {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of adapter is to make two incompatible interfaces to interact with each other

        Payment payment = new Adapter(new ExtPaymentAPI());

        payment.pay(400);

        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }

}
