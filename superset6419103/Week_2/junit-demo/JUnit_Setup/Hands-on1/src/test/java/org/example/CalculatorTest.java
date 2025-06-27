package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void twoplustwoisequalstofour(){
        var calculator=new Calculator();
        int result= calculator.add(4,4);
        System.out.println("4+4="+result);
        assertEquals(8,result);
    }
}