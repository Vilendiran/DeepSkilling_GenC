package superset6419103.DesignPatternAndPrinciple.DecoratorPatternExample;

public class SMSdecorator extends NotifierDecorator{
    public SMSdecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("sending sms: "+ message);
    }
    
}
