package Lesson2.example7;

public class Exercise7 {
    public static void main(String[] args) {
        // 7. Сохранить в массив типа char свою фамилию и имя (размер массива не должен превышать количество символов в фамилии пробел имени)
        String text = "Lyubin Vladimir";
        char[] array = text.toCharArray();
        char[] mass = new char[15];
        for (int i = 0; i < mass.length && i<array.length ; i++) {
            mass[i] = array[i];
        }
        for (int i = 0; i < mass.length && i<array.length; i++) {
            System.out.println(mass[i]);
        }
    }
}