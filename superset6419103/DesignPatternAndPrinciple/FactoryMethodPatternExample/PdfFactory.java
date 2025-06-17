package superset6419103.DesignPatternAndPrinciple.FactoryMethodPatternExample;

public class PdfFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
    
}
