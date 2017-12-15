package Lesson2.example9;

public class Exercise9 {
    public static void main(String[] args) {
        // 9. Удалить из массива (1е задание) все элементы, кратные 3
        int array[]=new int[100];
        int index=0;
        int mass[] = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * mass.length + 1);
            if(mass[i]%3!=0){
                array[index] = mass[i];
                index++;
        }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

