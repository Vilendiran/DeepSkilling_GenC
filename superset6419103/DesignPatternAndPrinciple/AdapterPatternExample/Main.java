package superset6419103.DesignPatternAndPrinciple.AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor PayPal =new PayPalAdapter();
        PaymentProcessor WallMart = new WallmartAdapter();
        PaymentProcessor Amazon = new AmazonAdapter();

        PayPal.processPayment(88);
        WallMart.processPayment(110);
        Amazon.processPayment(66);
    }
}
