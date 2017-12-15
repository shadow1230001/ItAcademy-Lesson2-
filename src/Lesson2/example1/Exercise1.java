package Lesson2.example1;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. Вывести из массива (задание 1) все элементы на экран
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        for (int i : mass) {
            System.out.println(i);
        }
    }
}
