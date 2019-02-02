package com.home.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class InputControllerTest {
    @Test
    public void testRequestUserInput() {
        String data = "qwert asd\nasdfgh123\n";
        InputStream in = new ByteArrayInputStream(data.getBytes());
        InputController inputController = new InputController(in);

        assertEquals("qwert asd", inputController.requestSentence());
        assertEquals("asdfgh123", inputController.requestSentence());
    }
}
