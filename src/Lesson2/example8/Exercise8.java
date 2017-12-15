package Lesson2.example8;

public class Exercise8 {
    public static void main(String[] args) {
        // 8. Добавить в массив из задания 7 пробел и отчество
        String text = "Lyubin Vladimir Eugenavich";
        char[] array = text.toCharArray();
        char[] mass = new char[26];
        for (int i = 0; i < mass.length && i < array.length; i++) {
            mass[i] = array[i];
        }
        for (int i = 0; i < mass.length && i < array.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
