package com.bkushmyruk.lesson4;

public class Main {
    public static void main(String[] args) {

        HelloWorldController helloWorldController = new HelloWorldController(new View(), new MessageService());
        helloWorldController.run("Hello world!");
    }
}

