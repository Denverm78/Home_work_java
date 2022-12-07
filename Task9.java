/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
(можно только одну из диагоналей, если обе сложно). 
Определить элементы одной из диагоналей можно по следующему принципу: 
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]; */

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int number = scanner.nextInt();
        scanner.close();
        metod9(number);
    }

    private static void metod9(int num) {
        int array[][]= new int[num][num];
        for (int i = 0; i < num; i++) {
            array[i][i]=1;
            array[i][num-1-i]=1;
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}
