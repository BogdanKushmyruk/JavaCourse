package com.bkushmyruk.ipfilter.view;

import com.bkushmyruk.ipfilter.util.Messages;

public class View {
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public void finish (boolean b){
        if (b) {
            View.printMessage(Messages.BLACK_IP__MESSAGE);
        } else {
            View.printMessage(Messages.WHITE_IP__MESSAGE);
        }
    }
}
