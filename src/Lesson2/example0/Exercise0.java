package Lesson2.example0;

public class Exercise0 {
    public static void main(String[] args) {
        // 0. Заполнить массив размером 100 элементов случайными числами
        int mass[] = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * mass.length + 1);
        }
        for (int i : mass) {
            System.out.println(i);
        }
    }
}

