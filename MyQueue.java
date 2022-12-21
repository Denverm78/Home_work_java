/* В шаблоне MyQueue с урока реализовать методы */

          
        import java.util.LinkedList;
        import java.util.Scanner;
        
        public class MyQueue {
        
            private static LinkedList<String> queue = new LinkedList<String>();
        
            public static void main(String[] args) {
                queue.add("Nikita");
                queue.add("Denis");
                boolean a = true;
                while (a == true) {
                    a = menu();
                }
            }
        
            private static boolean menu() {
                Scanner scanner1 = new Scanner(System.in);
        
                System.out.println();        
                System.out.println("1. Добавить в конец очереди.");
                System.out.println("2. Посмотреть первое в очереди.");
                System.out.println("3. Извлечь и вернуть первое в очереди.");
                System.out.println("4. Закончить работу.");
                System.out.print("Выберите номер действия: ");
        
                int num = scanner1.nextInt();
                System.out.println();
        
                if (num == 1) { // Добавить в конец очереди
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Введите строку для добавления в конец очереди: ");
                    String inputElement = scanner2.nextLine();
                    // scanner2.close();
                    add(inputElement);
                    // scanner2.close();
                    System.out.println("Очередь: " + queue);
                    return true;
        
                } else if (num == 2) { // Посмотреть первое в очереди
                    System.out.println(queue);
                    System.out.println("Первый элемент в очереди: " + top());
                    return true;
        
                } else if (num == 3) { // Извлечь и вернуть первое в очереди
                    if (queue.size() > 0) {
                        System.out.println("Первый элемент в очереди: " + remove() + ". Удаляем его.");
                        System.out.println("Очередь: " + queue);               
                        return true;
                    } else {
                        System.out.println("Очередь пустая");
                        return true;
                    }
        
                } else if (num == 4) { // Закончить работу со стеком
                    return false;
                } else {
                    System.out.println("Вы ввели неверное значение. Введите число от 1 до 4");
                    return true;
                }
            }
        
            private static void add(String string) {
                queue.add(0, string);        
            }
        
            private static String top() {
                queue.get(queue.size() - 1);
                return queue.get(queue.size() - 1);
            }
        
            private static String remove() {
                String endElem = queue.get(queue.size() - 1);
                queue.remove(queue.size() - 1);
                return endElem;
            }
        }   