package com.bibash.directories;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
    public static void main(String[] args) {
        FilenameFilter filenameFilter = (file, fileName) -> {
          return fileName.contains(".");
        };
        String[] contents = new File(".").list(filenameFilter);
        for (String file :
                contents) {
            System.out.println(file);
        }

        new File("myDir").mkdir();
    }
}
