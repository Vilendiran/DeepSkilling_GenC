package superset6419103.DesignPatternAndPrinciple.ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature1.jpg");
        Image image2 = new ProxyImage("nature2.jpg");

     System.out.println("First Call");
        image1.display();  // Loads from remote server

        System.out.println("\n Second Call");
        image1.display();  // Uses cache

        System.out.println("\n Third Call ");
        image2.display();  // Loads from remote server
    }
}
    