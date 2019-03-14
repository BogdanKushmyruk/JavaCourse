package com.bkushmyruk.ipfilter;


import com.bkushmyruk.ipfilter.controller.IPFilterController;
import com.bkushmyruk.ipfilter.model.IPFilterService;
import com.bkushmyruk.ipfilter.view.View;

public class Main {
    public static void main(String[] args) {
        String inputIP = args[0];
        System.out.println(inputIP);
        View view = new View();
        IPFilterService ipFilterService = new IPFilterService();
        IPFilterController ipFilterController = new IPFilterController(ipFilterService, view);
        ipFilterController.run(inputIP);
    }
}
