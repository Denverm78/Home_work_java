/*Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, 
указанное количество раз; */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String myString = scanner.nextLine();
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();
        metod4(myString, number);
    }

    private static void metod4(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
