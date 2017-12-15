package Lesson2.example10;

import java.util.Arrays;

public class Exercise10 {
    //Quicksort
    private static void quicksort(int[] array1, int startIndex, int endIndex) {
        int pivotValue = getPivot(array1, startIndex, endIndex);
        int currentStartIndex = startIndex;
        int currentEndIndex = endIndex - 1;

        while (currentStartIndex < currentEndIndex) {
            while (array1[currentStartIndex] < pivotValue)
                currentStartIndex++;
            while (array1[currentEndIndex] > pivotValue)
                currentEndIndex--;
            if (currentStartIndex < currentEndIndex) {
                int buffer = array1[currentStartIndex];
                array1[currentStartIndex] = array1[currentEndIndex];
                array1[currentEndIndex] = buffer;
            }
        }
        if (currentStartIndex > startIndex)
            quicksort(array1, startIndex, currentStartIndex);
        if (endIndex > currentStartIndex + 1)
            quicksort(array1, currentStartIndex + 1, endIndex);
    }

    private static int getPivot(int[] array1, int startIndex, int endIndex) {
        return array1[endIndex - 1];
    }

    public static void main(String[] args) {
        // 10. Отсортировать массив по возрастанию / убыванию следующими способами
        // (в классе выбрать 2 любых способа):
        // пузырьком, вставками, выбором, Быстрая сортировка
        //Bubblesort
//        int mass[] = new int[15];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = (int) (Math.random() * mass.length + 1);
//        }
//        for (int i = mass.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                int count = 0;
//                if (mass[j] > mass[j + 1]) {
//                    count = mass[j];
//                    mass[j] = mass[j + 1];
//                    mass[j + 1] = count;
//                }
//            }
//        }
//        for (int i = 0; i < 15; i++) {
//            System.out.println(mass[i]);
//        }

        //Sorted by insert
//        Scanner scanner = new Scanner(System.in);
//        PrintWriter printWriter = new PrintWriter(System.out);
//        int size = scanner.nextInt();
//        int[] mass = new int[size];
//        for (int i = 0; i < size; i++) {
//            mass[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            int temp = mass[i];
//            int j = i - 1;
//            while (j >= 0 && mass[j] > temp) {
//                mass[j + 1] = mass[j];
//                j--;
//            }
//            mass[j + 1] = temp;
//        }
//        for (int i = 0; i < size; i++) {
//            printWriter.println(mass[i] + " ");
//        }
//        scanner.close();
//        printWriter.close();
        //sorting by selecting
//        Scanner scanner = new Scanner(System.in);
//        PrintWriter printWriter = new PrintWriter(System.out);
//        int size = scanner.nextInt();
//        int[] mass = new int[size];
//        for (int i = 0; i < size; i++) {
//            mass[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            int minValueIndex = i;
//            for (int j = i + 1; j < size; j++) {
//                if (mass[j] < mass[minValueIndex]) {
//                    minValueIndex = j;
//                }
//            }
//            int temp = mass[i];
//            mass[i] = mass[minValueIndex];
//            mass[minValueIndex] = temp;
//        }
//        for (int i = 0; i < size; i++) {
//            printWriter.print(mass[i] + " ");
//        }
//        scanner.close();
//        printWriter.close();

        int[] array1 = {-100, 25, 48, -88, 0, 73, -240};
        quicksort(array1, 0, array1.length);
        System.out.println(Arrays.toString(array1));

    }
}



