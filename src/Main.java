import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Створення сканера для вводу тексту з консолі
        Scanner scanner = new Scanner(System.in);
        
        // Запит на введення тексту
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();
        
        // Перетворення введеного тексту в StringBuilder для подальшої обробки
        StringBuilder text = new StringBuilder(inputText);
    }
}
