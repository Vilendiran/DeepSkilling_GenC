package superset6419103.DesignPatternAndPrinciple.DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapp;

    public NotifierDecorator(Notifier notifier){
        this.wrapp = notifier;
    }
    @Override
    public void send(String message){
        wrapp.send(message);
    }
    
}
