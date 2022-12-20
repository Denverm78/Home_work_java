/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int number = scanner.nextInt();
        scanner.close();
        LinkedList<Integer> originList = getLinkedList(number);
        System.out.println("Исходный список: " + originList);
        LinkedList<Integer> invertedList = getInvertedList(originList);
        System.out.println("Перевернутый список: " + invertedList);
    }

    private static LinkedList<Integer> getLinkedList(int num) {
        Random random = new Random();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            newList.add(random.nextInt(100));
        }
        return newList;
    }

    private static LinkedList<Integer> getInvertedList(LinkedList<Integer> origList) {
        LinkedList<Integer> invList = new LinkedList<>();
        for (int i = origList.size() - 1; i >= 0; i--) {
            invList.add(origList.get(i));
        }
        return invList;
    }
}
