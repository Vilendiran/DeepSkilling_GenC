package superset6419103.DesignPatternAndPrinciple.AdapterPatternExample;

public class WallmartAdapter implements PaymentProcessor {
    private static WallmartGateway wall = new WallmartGateway();

    @Override
    public void processPayment(double amount){
        wall.makePayment(amount);
    }
    
}
