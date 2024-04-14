import java.util.Scanner;

public class FunctionSelector {
    private PicnicAnalyzer picnicAnalyzer;

    public FunctionSelector(PicnicAnalyzer picnicAnalyzer) {
        this.picnicAnalyzer = picnicAnalyzer;
    }

    public void selectFunction() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите функцию:");
            System.out.println("1. Подсчет количества слов");
            System.out.println("2. Поиск самого длинного слова");
            System.out.println("3. Вычисление частоты слов");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int wordCount = picnicAnalyzer.countWords();
                    System.out.println("Количество слов в файле: " + wordCount);
                    break;
                case 2:
                    String longestWord = picnicAnalyzer.findLongestWord();
                    System.out.println("Самое длинное слово: " + longestWord);
                    break;
                case 3:
                    picnicAnalyzer.calculateWordFrequency();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
    }
}
