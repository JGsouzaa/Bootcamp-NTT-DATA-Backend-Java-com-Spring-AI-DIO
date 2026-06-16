package patterns.design.adapter;

public class ExtPaymentAPI {
    public void makePay(double amount){
        System.out.println("Payment realized on ExtPayment: " + amount);
    }
}
