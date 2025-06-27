package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testInteraction(){
        ExternalApi mockApi=mock(ExternalApi.class);
        MyService service=new MyService(mockApi);
        service.fetchdata();
        verify(mockApi).getData();
    }
}
