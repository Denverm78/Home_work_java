/* Написать метод, который определяет, является ли год високосным, 
и возвращает boolean (високосный - true, не високосный - false). 
Каждый 4-й год является високосным, кроме каждого 100-го, 
при этом каждый 400-й – високосный.*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        int myYear = scanner.nextInt();
        scanner.close();
        boolean result = metod5(myYear);
        System.out.println(result);
    }

    private static boolean metod5(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 & year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
