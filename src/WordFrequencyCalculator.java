import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequencyCalculator {
    private String fileName;

    public WordFrequencyCalculator(String fileName) {
        this.fileName = fileName;
    }

    public void calculateWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Сортировка частоты слов в порядке убывания
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequency.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Вывод частоты слов
        System.out.println("Частота слов (от большего к меньшему):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
