package com.academy.lesson11.file;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        String name = "Tina";

        String path = "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/data/name-written.txt";

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
