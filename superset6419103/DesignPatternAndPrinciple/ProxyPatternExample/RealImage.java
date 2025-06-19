package superset6419103.DesignPatternAndPrinciple.ProxyPatternExample;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromRealServer();
    }
    
    private void loadFromRealServer(){
        System.out.println("loading"+ filename + "server");
    

    try{
        Thread.sleep(2000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
    @Override
    public void display(){
        System.out.println("loading"+ filename);
    }
    
}
