/*Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int number = scanner.nextInt();
        scanner.close();
        findMaxMin(number);
    }

    private static void findMaxMin(int num) {
        Random random = new Random();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + maxNumber);
        System.out.println("Минимальный элемент массива: " + minNumber);
    }
}
