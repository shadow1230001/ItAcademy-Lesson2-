package Lesson2.example9_1;

public class Exercise9Dot1 {
    public static void main(String[] args) {
        // 9.1 Привести размер массива из задания 9 в соответствие с реальным
        // количеством хранимых элементов
        int array[] = new int[100];
        int index = 0;
        int mass[] = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * mass.length + 1);
            if (mass[i] % 3 != 0) {
                array[index] = mass[i];
                index++;
            }
        }
        for (int i = 0; array[i] != 0 && i < array.length; i++) {
            index = i;
        }
        index++;
        int minimazeArray[] = new int[index];
        for (int i = 0; i < minimazeArray.length; i++) {
            minimazeArray[i] = array[i];
        }
        for (int i = 0; i < minimazeArray.length; i++) {
            System.out.println(minimazeArray[i]);

        }

    }
}
