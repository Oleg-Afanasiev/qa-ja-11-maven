package com.academy.lesson11.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ReadDemo {
    public static void main(String[] args) {
        String path = "C:\\Users\\af_oleg\\Documents\\QA-JA-11\\maven-project\\data\\женские имена.txt";

        // 1 Scanner - не реккомендован к использованию
        System.out.println("1 способ ");
        // низкоуровневый доступ к файлу (на выходе - бинарные данные)
        try(FileInputStream is = new FileInputStream(path);
            Scanner scanner = new Scanner(is)) {
            // высокоуровневый доступ (на выходе символы)
            String name = scanner.nextLine();
            System.out.println(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 2 способ FileReader - не реккомендован к использованию
        List<String> names = new ArrayList<>();
        System.out.println("2 способ ");
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr)) {

            String name;
            while((name = br.readLine()) != null) {
                System.out.println(name);
                names.add(name);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(names);
        names.sort((e1, e2)->e2.compareTo(e1));
        System.out.println(names);
    }
}
