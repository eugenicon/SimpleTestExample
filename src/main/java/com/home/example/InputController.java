package com.home.example;

import java.io.InputStream;
import java.util.Scanner;

public class InputController {
    private final Scanner scanner;

    public InputController(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public String requestSentence() {
        return scanner.nextLine();
    }
}
