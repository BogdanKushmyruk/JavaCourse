package com.bkushmyruk.gamemoreorless.model;

import com.bkushmyruk.gamemoreorless.util.MessageConstants;
import com.bkushmyruk.gamemoreorless.view.View;

import java.util.Scanner;

public class GameValidator {

    public boolean validationLimits(int downLimit, int upLimit) {
        return downLimit < upLimit;
    }

    public static int inputIntValueWithScanner(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            View.printMessage(MessageConstants.WRONG_FORMAT_NUMBER_MESSAGE);

            scanner.next();
        }
        return scanner.nextInt();
    }


}

