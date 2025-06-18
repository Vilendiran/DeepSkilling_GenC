package superset6419103.DesignPatternAndPrinciple.BuilderPatternExample;

import java.lang.module.ModuleDescriptor.Builder;

//1.product class
public class Computer {
//2.attributes
private String cpu;
private String RAM;
private String Storage;
private String OS;

//builder object for private class
private Computer(ComputerBuilder builder){
    this.cpu = builder.cpu;
    this.RAM = builder.RAM;
    this.Storage = builder.Storage ;
    this.OS = builder.OS;

}
//Static nested builder class

public static class ComputerBuilder {
    private String cpu;
    private String RAM;
    private String Storage;
    private String OS; 

    //constructor with parameter

    public ComputerBuilder(String cpu, String RAM){
        this.cpu = cpu;
        this.RAM = RAM;
    }
    public ComputerBuilder str(String Storage, String OS){
        this.Storage = Storage;
        this.OS = OS;
        return this;
    }

    //final method

    public Computer build(){
        return new Computer(this);
    }  
}

//override for readable output

public String toString(){
    return "Computer config  CPU: "+ cpu + ", RAM : "+ RAM+" , Storage: "+Storage+", OS: "+OS;
}
    
}
