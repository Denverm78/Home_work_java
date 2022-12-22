/*Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. 
Учесть, что под одной фамилией может находиться несколько телефонных номеров.
Важно: Каждый пользователь - уникальный ключ в коллекции. 
В выбранной Вами коллекции не должно быть повторений имён */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    static Map<String, ArrayList<String>> myPhoneBook = new HashMap<>();

    public static void main(String[] args) {
        // Map<String, ArrayList<String>> myPhoneBook = new HashMap<>();
        String surname1 = "Иванов";
        String surname2 = "Петров";
        ArrayList<String> tel1 = new ArrayList<>(
                Arrays.asList("89103304050", "89209802125"));
        ArrayList<String> tel2 = new ArrayList<>(
                Arrays.asList("891533149900", "89261765552"));
        myPhoneBook.put(surname1, tel1);
        myPhoneBook.put(surname2, tel2);
        boolean flag = true;
        while (flag == true) {
            int menuItem = menu();

            if (menuItem == 1) {
                viewPhoneBook();
            } else if (menuItem == 2) {
                flag = addNumberToPhonebook();
            } else if (menuItem == 3) {
                flag = findNumberFromPhonebook();
            } else if (menuItem == 4) {
                System.out.println();
                System.out.println("Работа завершена.");
                flag = false;
            } else {
                System.out.println();
                System.out.println("Вы ввели неверное значение. Введите число от 1 до 4");
            }
        }
    }

    private static Integer menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Посмотреть телефонную книгу.");
        System.out.println("2. Добавить номер в телефонную книгу.");
        System.out.println("3. Найти номер в телефонной книге.");
        System.out.println("4. Закончить работу.");
        System.out.print("Выберите номер действия: ");
        int num = scanner.nextInt();
        return num;
    }

    private static void viewPhoneBook() {
        System.out.println();
        System.out.println("Номера в телефонной книге: ");
        for (Map.Entry<String, ArrayList<String>> entry : myPhoneBook.entrySet()) {
            // String stringNumber = String.join("", entry.getValue());
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }

    private static boolean addNumberToPhonebook() {
        Scanner newScanner = new Scanner(System.in, "cp866");
        System.out.println();
        System.out.print("Введите фамилию: ");
        String newName = newScanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String newTelNumber = newScanner.nextLine();
        for (Map.Entry<String, ArrayList<String>> entry : myPhoneBook.entrySet()) {
            if (entry.getKey().equals(newName)) {
                ArrayList<String> tempArrayListName = entry.getValue();
                String tempStringName = entry.getKey();
                tempArrayListName.add(newTelNumber);
                myPhoneBook.put(tempStringName, tempArrayListName);
                System.out.println("Номер добавлен.");
                return true;
            }
        }
        ArrayList<String> newEntry = new ArrayList<>();
        newEntry.add(newTelNumber);
        myPhoneBook.put(newName, newEntry);
        System.out.println("Номер добавлен.");
        return true;

    }

    private static boolean findNumberFromPhonebook() {
        Scanner newScanner = new Scanner(System.in, "cp866");
        System.out.println();
        System.out.print("Введите фамилию: ");
        String findName = newScanner.nextLine();
        for (Map.Entry<String, ArrayList<String>> entry : myPhoneBook.entrySet()) {
            if (entry.getKey().equals(findName)) {
                System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));                
                return true;
            }
        }
        System.out.println("Такой фамилии в справочнике нет.");
        return true;
    }
}