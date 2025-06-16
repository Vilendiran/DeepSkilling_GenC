package superset6419103.DesignPatternAndPrinciple.SingletonPatternExample;

public class Loggertest {
    public static void main(String[] args) {
        //use method for getting instance
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();
        //writing message
        l1.writelog("Starting the system");
        l2.writelog("System is running smoothly");

        //check both the instance is same
        if(l1 == l2){
            System.out.println("Singleton is verfied");
        }else{
            System.out.println("Singelton failed");
        }
    }
}
