package com.bkushmyruk.ipfilter.controller;


import com.bkushmyruk.ipfilter.model.IPFilterService;
import com.bkushmyruk.ipfilter.model.IPFilterValidator;
import com.bkushmyruk.ipfilter.util.Messages;
import com.bkushmyruk.ipfilter.view.View;

public class IPFilterController {
    private IPFilterService ipFilterservice;
    private View view;

    public IPFilterController(IPFilterService ipFilterservice, View view) {
        this.ipFilterservice = ipFilterservice;
        this.view = view;
    }

    public void run(String inputIP) {

        IPFilterValidator ipFilterValidator = new IPFilterValidator();
        if (!(ipFilterValidator.validIP(inputIP))) {
            View.printMessage(Messages.WRONG_INPUT_DATA_MESSAGE);
        } else {
            boolean result = ipFilterservice.ipFilter(inputIP);
            view.finish(result);
        }
    }
}
