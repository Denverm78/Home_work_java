/* Написать метод, принимающий на вход два аргумента: len и initialValue, 
и возвращающий одномерный массив типа int длиной len, 
каждая ячейка которого равна initialValue;*/

import java.util.Scanner;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива len: ");
        int len = scanner.nextInt();
        System.out.print("Введите значение initialValue: ");
        int initialValue = scanner.nextInt();
        scanner.close();
        int array[] = metod10(len, initialValue);
        System.out.println("Полученный массив: " + Arrays.toString(array));
    }

    private static int[] metod10(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
