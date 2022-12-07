/* Написать метод, которому в качестве параметра передается целое число. 
Метод должен вернуть true, если число отрицательное, и вернуть false 
если положительное.*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean result = metod3(number);
        System.out.println(result);
    }

    private static boolean metod3(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }
}