package Lesson2.example2;

public class Exercise2 {
    public static void main(String[] args) {
        //Вывевсти все четные элементы массива
        int mass[] = new int[100];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = i;
            if (mass[i] % 2 == 0) {
                System.out.println(mass[i]);
            }
        }
    }
}
