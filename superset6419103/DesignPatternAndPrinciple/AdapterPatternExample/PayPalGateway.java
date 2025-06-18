package superset6419103.DesignPatternAndPrinciple.AdapterPatternExample;

public class PayPalGateway {
    public void sendPayment(double amount){
        System.out.println("paypal has processed"+ amount);
    }
}
