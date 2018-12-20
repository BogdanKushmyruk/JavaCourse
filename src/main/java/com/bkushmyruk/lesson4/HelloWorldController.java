package com.bkushmyruk.lesson4;

public class HelloWorldController {
    private View view;
    private MessageService messageService;

    public HelloWorldController(View view, MessageService messageService) {
        this.view = view;
        this.messageService = messageService;
    }

    public void run(String text) {
        Message message = new Message(text);
        view.printMessage(messageService.getMessage(message));
    }
}

