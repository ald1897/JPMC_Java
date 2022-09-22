package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /**
         * file I/o
         * streams:
         * byte oriented => media
         * character oriented => text files
         * InputStream, Output Stream
         * FileInputStream, FileOutputStream
         *
         * Reader, Writer
         * FileReader, FileWriter
         *
         * File => provides with the information of a file and performs operations  related toa  file reading adn writing
         *
         *
         */

        File dir = new File("dir");
        dir.mkdir();
        File f1 = new File(dir,"text.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());



    }
}
