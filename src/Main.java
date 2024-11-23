import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Створення сканера для вводу тексту з консолі
        Scanner scanner = new Scanner(System.in);
        
        // Запит на введення тексту
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();
        
        // Перетворення введеного тексту в StringBuilder для подальшої обробки
        StringBuilder text = new StringBuilder(inputText);
        
        // Виконати дію: сортування речень за кількістю слів
        sortSentencesByWordCount(text);
    }

    // Метод для сортування речень за кількістю слів
    public static void sortSentencesByWordCount(StringBuilder text) {
        // Розбиття тексту на речення
        String[] sentences = text.toString().split("\\. ");
    }
}
