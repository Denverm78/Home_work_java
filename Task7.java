/*Задать пустой целочисленный массив длиной 100. 
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100; */

import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {
        metod7();
    }

    private static void metod7() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println("Полученный массив: " + Arrays.toString(array));
    }
}
