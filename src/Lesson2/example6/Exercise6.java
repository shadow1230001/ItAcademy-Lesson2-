package Lesson2.example6;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        //6 Найти максимальный и минимальный элемент среди чётных/нечётных
        Random random = new Random();
        int mass[]=new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(mass.length) +1;
        }
        int minAdd = mass[0];
        int minEven = mass[0];
        int maxAdd = mass[0];
        int maxEven = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                if (mass[i] > minEven) {
                    minEven = mass[i];
                }if(mass[i] < maxEven){
                    maxEven=mass[i];
                }
            } else {
                if (mass[i] < minAdd) {
                    minAdd = mass[i];
                }
                if (mass[i] > maxAdd) {
                    maxAdd = mass[i];
                }
            }
        }
        System.out.println(minAdd);
        System.out.println(minEven);
        System.out.println(maxAdd);
        System.out.println(maxEven);
    }
}
