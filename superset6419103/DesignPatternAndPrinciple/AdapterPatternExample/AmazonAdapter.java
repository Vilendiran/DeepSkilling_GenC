package superset6419103.DesignPatternAndPrinciple.AdapterPatternExample;

public class AmazonAdapter implements PaymentProcessor {
    private static AmazonGateway amm = new AmazonGateway();

    @Override
    public void processPayment(double amount){
    amm.pay(amount);
    }
    
}
