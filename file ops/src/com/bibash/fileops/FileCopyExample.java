package com.bibash.fileops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {
    public static void main(String[] args) {
        Path source = Paths.get("/home/itglance/Desktop/myfile.txt");
        Path destination = Paths.get("/home/itglance/Desktop/newfile.txt");

        try {
            Files.copy(source, destination, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
