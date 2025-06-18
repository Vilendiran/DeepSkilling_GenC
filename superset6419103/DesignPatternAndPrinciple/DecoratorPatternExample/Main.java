package superset6419103.DesignPatternAndPrinciple.DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier sms= new SMSdecorator(emailNotifier);

        Notifier fullNotifier = new SlackDecorator(sms);

        fullNotifier.send("System Alert: Cpu usage High!");
    }
}
