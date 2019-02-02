package com.home.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AccessPointTest {
    @Mock
    private InputController inputController;

    @Mock
    private WordCounter wordCounter;

    @Test
    public void testAccessPoint() {
        when(inputController.requestSentence()).thenReturn("qwe");

        AccessPoint accessPoint = new AccessPoint(inputController, wordCounter);
        accessPoint.startApplication();

        verify(inputController).requestSentence();
        verify(wordCounter).readWords("qwe");
    }
}
