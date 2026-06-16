package patterns.design.adapter;

public class Adapter implements Payment{
    private ExtPaymentAPI api;

    public Adapter(ExtPaymentAPI api){
        this.api = api;
    }

    @Override
    public void pay(double value) {
        api.makePay(value);
    }
}
