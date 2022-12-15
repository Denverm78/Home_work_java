/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое из этого списка. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int number = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> originArray = (ArrayList<Integer>) getRandomArray(number);
        System.out.println("Исходный массив: " + originArray);
        int minNumber = Collections.min(originArray);
        int maxNumber = Collections.max(originArray);        
        double arithmeticMean = getArithmeticMean(originArray);        
        System.out.println("Минимальный элемент массива: " + minNumber);
        System.out.println("Максимальный элемент массива: " + maxNumber);
        System.out.printf("Среднее арифметическое массива: %.2f \n", arithmeticMean);
    }    

    private static List<Integer> getRandomArray(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            array.add(random.nextInt(100));
        }
        return array;
    }

    private static double getArithmeticMean(ArrayList<Integer> arr) {
        double result = 0;
        double sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        result = sum / arr.size();
        return result;
    }
}
