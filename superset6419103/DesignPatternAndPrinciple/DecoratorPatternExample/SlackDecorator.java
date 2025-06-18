package superset6419103.DesignPatternAndPrinciple.DecoratorPatternExample;

public class SlackDecorator extends NotifierDecorator{
    public SlackDecorator(Notifier notifier){
        super(notifier);
    }
    @Override
     public void send(String message){
        super.send(message);
        System.out.println("sending slack message: "+ message);
     }
    
}
