package com.home.example;

public class MainClass {
    public static void main(String[] args) {
        AccessPoint accessPoint = new AccessPoint(new InputController(System.in), new WordCounter());
        accessPoint.startApplication();
    }
}
