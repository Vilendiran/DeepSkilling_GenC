package superset6419103.DesignPatternAndPrinciple.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
    
}
