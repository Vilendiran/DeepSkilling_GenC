package superset6419103.Week_2.Mockito

public class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api){
        this.api=api;
    }
    public String fetchdata(){
        return api.getData();
    }
}
