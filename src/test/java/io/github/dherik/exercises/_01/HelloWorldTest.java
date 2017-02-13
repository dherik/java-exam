package io.github.dherik.exercises._01;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void helloWorld() {

        Message helloWorldMessage = new Message("Hello World");
        String message = helloWorldMessage.printMessage();
        Assert.assertEquals("Hello World!", message);

    }

}
