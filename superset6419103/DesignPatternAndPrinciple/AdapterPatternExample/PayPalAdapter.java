package superset6419103.DesignPatternAndPrinciple.AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway paypal = new PayPalGateway();
@Override
    public void processPayment(double amount){
        paypal.sendPayment(amount);
    }
    
}
