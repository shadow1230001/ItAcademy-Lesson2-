package Lesson2.example5;

public class Exercise5 {
    public static void main(String[] args) {
        // 5. Найти и вывести на экран максимальный / минимальный элемент
        int[] mass = new int[100];
        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println(min + " " + max);
    }
}

