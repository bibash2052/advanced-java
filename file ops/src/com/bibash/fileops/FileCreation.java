package com.bibash.fileops;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        File file =new File("/home/itglance/Desktop/myfile.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            if(isFileCreated) {
                System.out.println("File has been created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
