package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    public void testExternalApi(){
        ExternalApi mockApi=mock(ExternalApi.class);
        MyService service=new MyService(mockApi);
        String result=service.fetchdata();
        when(mockApi.getData()).thenReturn("Mock data");
        System.out.println("Result for "+result);
        assertEquals("Mock data",result);
    }
}
