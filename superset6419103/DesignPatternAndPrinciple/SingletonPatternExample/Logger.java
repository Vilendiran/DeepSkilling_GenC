//Singleton pattern has only one object and provide global access point. From my understanding,it ensures single instance with private static keyword//



package superset6419103.DesignPatternAndPrinciple.SingletonPatternExample;

public class Logger {
    //for single instance
    private static Logger instance;
    //to prevent direct intialization
    private Logger() {
        System.out.println("Logger instance is created");
    }
    //for global access
    public static Logger getLogger(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    //log method
    public void writelog(String message){
        System.out.println("log:"+ message);
    }
}
