package superset6419103.DesignPatternAndPrinciple.BuilderPatternExample;

public class TestBuilderPatter {
    public static void main(String[] args) {
        Computer myComp = new Computer.ComputerBuilder("Intel i5","16GB" ).str("1tb","window 11" ).build();
        System.out.println(myComp);
        Computer myComp2 = new Computer.ComputerBuilder("Intel i7", "8Gb").str("2tb","window 10").build();
    System.out.println(myComp2);
    }
    
}
