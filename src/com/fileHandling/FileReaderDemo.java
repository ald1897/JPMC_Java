package com.fileHandling;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = "";
        while((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();

    }
}

