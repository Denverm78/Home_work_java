/* В шаблоне MyStack с урока реализовать методы */

import java.util.LinkedList;
import java.util.Scanner;

public class MyStack {

    private static LinkedList<String> stack = new LinkedList<String>();

    public static void main(String[] args) {
        stack.add("Nikita");
        stack.add("Denis");
        boolean a = true;
        while (a == true) {
            a = menu();
        }
    }

    private static boolean menu() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println();
        System.out.println("1. Добавить в конец стека.");
        System.out.println("2. Посмотреть последнее в стеке.");
        System.out.println("3. Посмотреть и извлечь последнее в стеке.");
        System.out.println("4. Закончить работу.");
        System.out.print("Выберите номер действия: ");

        int num = scanner1.nextInt();
        System.out.println();

        if (num == 1) { // Добавить в конец стека
            Scanner scanner2 = new Scanner(System.in);
            System.out.println();
            System.out.print("Введите строку для добавления в конец стека: ");
            String inputElement = scanner2.nextLine();
            // scanner2.close();
            push(inputElement);
            System.out.println("Стек: " + stack);
            // scanner2.close();
            return true;

        } else if (num == 2) { // Посмотреть последнее в стеке
            System.out.println("Стек: " + stack);
            System.out.println("Последний элемент в стеке: " + peek());
            return true;

        } else if (num == 3) { // Посмотреть и извлечь последнее в стеке
            if (stack.size() > 0) {
                System.out.println("Последний элемент в стеке: " + pop() + ". Удаляем его.");
                System.out.println("Стек: " + stack);                 
                return true;
            } else {
                System.out.println("Стек пустой");
                return true;
            }

        } else if (num == 4) { // Закончить работу со стеком
            return false;
        } else {
            System.out.println("Вы ввели неверное значение. Введите число от 1 до 4");
            return true;
        }
    }

    private static void push(String string) {
        stack.add(string);        
    }

    private static String peek() {
        stack.get(stack.size() - 1);
        return stack.get(stack.size() - 1);
    }

    private static String pop() {
        String endElem = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return endElem;
    }
}