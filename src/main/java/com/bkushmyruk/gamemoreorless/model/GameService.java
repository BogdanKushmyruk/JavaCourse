package com.bkushmyruk.gamemoreorless.model;


import com.bkushmyruk.gamemoreorless.util.MessageConstants;
import com.bkushmyruk.gamemoreorless.view.View;

import java.util.Arrays;
import java.util.Scanner;

public class GameService {

    public int[] processGame(int downLimit, int upLimit) {
        int[] history = new int[1];
        int winNumber = random(downLimit, upLimit);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < history.length; i++) {
            View.printMessage(MessageConstants.GUESS_NUMBER_MESSAGE);
            int myNumber = GameValidator.inputIntValueWithScanner(scanner);
            history[i] = myNumber;

            if (myNumber > upLimit || myNumber < downLimit) {
                View.printMessage(MessageConstants.OUT_OF_BOUND_LIMITS_MESSAGE);
                history = Arrays.copyOf(history, history.length + 1);
                continue;
            }

            if (myNumber == winNumber) {
                View.printMessage(MessageConstants.CONGRATILATION_MESSAGE);
                break;
            } else if (myNumber < winNumber) {
                View.printMessage(MessageConstants.SMALLER_NUMBER_MESSAGE);
            } else {
                View.printMessage(MessageConstants.BIGGER_NUMBER_MESSAGE);;
            }
            history = Arrays.copyOf(history, history.length + 1);
        }
        return history;

    }

    private static int random(int downLimit, int upLimit) {

        return (int) ((upLimit - downLimit) * Math.random() + downLimit);
    }

}


