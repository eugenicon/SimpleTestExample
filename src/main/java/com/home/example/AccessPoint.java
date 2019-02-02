package com.home.example;

import java.util.List;

public class AccessPoint {
    private InputController inputController;
    private WordCounter wordCounter;

    public AccessPoint(InputController inputController, WordCounter wordCounter) {
        this.inputController = inputController;
        this.wordCounter = wordCounter;
    }

    public void startApplication() {
        String s = inputController.requestSentence();
        List<String> words = wordCounter.readWords(s);
    }
}
