/* Написать метод, которому в качестве параметра передается целое число, 
метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
Замечание: ноль считаем положительным числом.*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();
        metod2(number);
    }

    private static void metod2(int num) {
        if (num < 0) {
            System.out.println("Число " + num + " является отрицательным.");
        } else {
            System.out.println("Число " + num + " является положительным.");
        }
    }
}
