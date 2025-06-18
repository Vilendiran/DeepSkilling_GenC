package superset6419103.DesignPatternAndPrinciple.DecoratorPatternExample;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("sending Email: "+message);
    }
    
}
