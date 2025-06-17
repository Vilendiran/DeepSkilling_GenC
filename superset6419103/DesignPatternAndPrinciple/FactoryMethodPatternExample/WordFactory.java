package superset6419103.DesignPatternAndPrinciple.FactoryMethodPatternExample;
//concrete factories that decide which document to create//
public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
    
}
