package Lesson2.example3;

public class Exersice3 {
    public static void main(String[] args) {
        // 3. Посчитать разность всех нечётных элементов массива
        int mass[] = new int[100];
        int difference = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
            if (mass[i] % 2 != 0) {
                difference -= mass[i];
            }
        }
        System.out.println("Difference of all elements of mass " + difference);
    }
}
