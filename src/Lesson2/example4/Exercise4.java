package Lesson2.example4;

public class Exercise4 {
    public static void main(String[] args) {
        // 4. Посчитать количество чётных и нечётных элементов в массиве
        int mass[] = new int[100];
        int countOfSumm = 0;
        int countOfEven = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * mass.length + 1);
            if (mass[i] % 2 == 0) {
                countOfEven++;
            } else {
                countOfSumm++;

            }
        }
        System.out.println("Number of countOfSumm " + countOfSumm);
        System.out.println("Number of countOfEven " + countOfEven);
    }
}

