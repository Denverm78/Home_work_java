/*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST 
и метод, который запишет эту строку в простой текстовый файл, обработайте исключения. */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.ConsoleHandler;
// import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
// import java.util.logging.XMLFormatter;

public class Task13 {
    static Logger logger = Logger.getLogger(Task13.class.getName());     
    public static void main(String[] args) {                        
        String resultingString = getStringOfOneHundredWords();
        System.out.println(resultingString);
        printStringIntoFile(resultingString);
    }    

    private static String getStringOfOneHundredWords() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");            
        }
        return sb.toString();
    }

    private static void printStringIntoFile(String resString) { 
        ConsoleHandler ch = new ConsoleHandler();        
        logger.addHandler(ch);    
        // XMLFormatter xml = new XMLFormatter(); // В каком формате выводится log 
        SimpleFormatter sFormat = new SimpleFormatter();
        // ch.setFormatter(xml);
        ch.setFormatter(sFormat);       
        // try (PrintWriter pw = new PrintWriter("C:\\download\\result.txt")) {
        // Для корректной проверки запишем в файл в текущем каталоге:
        try (PrintWriter pw = new PrintWriter("./result.txt")) {
            pw.print(resString);
        } catch (FileNotFoundException e) {                                
            System.out.println("Ошибка! Файл не найден.");
            logger.info("File not found");
        }
    }
}
