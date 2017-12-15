package Lesson2.example11;

public class Exercise11 {
    public static void main(String[] args) {
        int[] mass = new int[40];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.println(mass[i]);
        }

        System.out.println(" And here are the numbers in the range >1 и <40:");

        for (int mas : mass) {
            if (mas > 1 && mas < 40) {
                System.out.println(mas);
            }
        }
    }
}

