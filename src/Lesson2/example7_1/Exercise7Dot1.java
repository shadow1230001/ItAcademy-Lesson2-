package Lesson2.example7_1;


import java.io.IOException;
import java.util.Scanner;

public class Exercise7Dot1 {
    public static void main(String[] args) throws IOException {
        // 7.1 Реализовать считывание фио для задачи 7 с клавиатуры
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(line);
        char[] array = line.toCharArray();
        char[] mass = new char[15];
        for (int i = 0; i < mass.length && i < array.length; i++) {
            mass[i] = array[i];
        }
        for (int i = 0; i < mass.length && i < array.length; i++) {
            System.out.println(mass[i]);
        }


    }
}
