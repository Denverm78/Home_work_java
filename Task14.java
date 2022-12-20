/*Пусть дан произвольный список целых чисел, удалить из него четные числа 
(в языке уже есть что-то готовое для этого) */

import java.util.ArrayList;
// import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int number = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> originArray = (ArrayList<Integer>) getRandomArray(number);
        System.out.println("Исходный массив: " + originArray);

        // Первый способ:
        // ArrayList<Integer> resultArray = deleteEvenNumbers1(originArray);
        // System.out.println("Массив без четных чисел: " + resultArray);
        
        // Второй способ:
        ArrayList<Integer> resultArray = deleteEvenNumbers2(originArray);
        System.out.println("Массив без четных чисел: " + resultArray);
    }

    private static List<Integer> getRandomArray(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            array.add(random.nextInt(100));
        }
        return array;
    }

    // private static ArrayList<Integer> deleteEvenNumbers1(ArrayList<Integer> resArray) {
    //     for (Iterator<Integer> iterator = resArray.iterator(); iterator.hasNext();) {
    //         Integer number = iterator.next();
    //         if (number % 2 == 0) {
    //             iterator.remove();
    //         }            
    //     }
    //     return resArray;
    // }

    private static ArrayList<Integer> deleteEvenNumbers2(ArrayList<Integer> resArray) {
        resArray.removeIf(num -> num%2==0);       
        return resArray;
    }
}