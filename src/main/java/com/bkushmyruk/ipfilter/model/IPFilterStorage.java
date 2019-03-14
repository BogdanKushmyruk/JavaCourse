package com.bkushmyruk.ipfilter.model;

import com.bkushmyruk.ipfilter.view.View;
import com.bkushmyruk.ipfilter.util.Messages;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;





public class IPFilterStorage {

    private static final String FILE_PATH = "./src/main/resources/File.txt";


    public Set<String> getListOfIp() {
        Set<String> addressesToBlock = new HashSet<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                addressesToBlock.add(scanner.nextLine());
            }
            fileReader.close();
        } catch (IOException e) {
            View.printMessage(Messages.LOST_IPADRESSES_LIST_MESSAGE);
        }
        return addressesToBlock;
    }


}
