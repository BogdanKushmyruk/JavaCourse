package com.bkushmyruk.gamemoreorless.view;

import com.bkushmyruk.gamemoreorless.model.GameValidator;
import com.bkushmyruk.gamemoreorless.util.MessageConstants;

import java.util.Arrays;
import java.util.Scanner;

public class GameView {
    public int[] startGame() {
        int[] limits = new int[2];
        Scanner scanner = new Scanner(System.in);
        View.printMessage(MessageConstants.INPUT_DOWNLIMIT_MESSAGE);

        limits[0] = GameValidator.inputIntValueWithScanner(scanner);
        View.printMessage(MessageConstants.INPUT_UPLIMIT_MESSAGE);

        limits[1] = GameValidator.inputIntValueWithScanner(scanner);

        return limits;
    }

    public void finishGame(int[] history) {
        System.out.println(Arrays.toString(history));
    }

}
