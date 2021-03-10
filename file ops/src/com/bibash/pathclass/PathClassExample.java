package com.bibash.pathclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("hello.txt");
        try {
            boolean isFileDeleted = Files.deleteIfExists(path);
            System.out.println(isFileDeleted);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path1 = Paths.get("/home/itglance/Desktop/myfile.txt");
        System.out.println(path1.getParent());
        System.out.println(path1.getRoot());
        System.out.println(path1.getFileName());
    }
}
