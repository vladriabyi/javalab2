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
        
        // Створення списку для зберігання пар "речення - кількість слів"
        List<Sentence> sentenceList = new ArrayList<>();
        for (String sentence : sentences) {
            // Підрахунок кількості слів у кожному реченні
            int wordCount = sentence.split("\\s+").length;
            sentenceList.add(new Sentence(sentence, wordCount));
        }
    }

    // Клас для збереження інформації про речення
    static class Sentence {
        private String text;
        private int wordCount;

        public Sentence(String text, int wordCount) {
            this.text = text;
            this.wordCount = wordCount;
        }

        public String getText() {
            return text;
        }

        public int getWordCount() {
            return wordCount;
        }
    }
}
