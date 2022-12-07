/*
 Написать метод, принимающий на вход два целых числа и проверяющий, 
 что их сумма лежит в пределах от 10 до 20 (включительно), 
 если да – вернуть true, в противном случае – false
 */

import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        scanner.close();
        boolean result = metod1(number1, number2);
        System.out.println(result);
        
    }

    private static boolean metod1(int numA, int numB) {
        if ((numA + numB) >= 10 & (numA + numB) <= 20){ 
        return true;
        } else return false;
    }
}