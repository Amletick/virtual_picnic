public class PicnicAnalyzer {
    private String fileName;

    public PicnicAnalyzer(String fileName) {
        this.fileName = fileName;
    }

    public int countWords() {
        WordCounter wordCounter = new WordCounter(fileName);
        return wordCounter.countWords();
    }

    public String findLongestWord() {
        LongestWordFinder longestWordFinder = new LongestWordFinder(fileName);
        return longestWordFinder.findLongestWord();
    }

    public void calculateWordFrequency() {
        WordFrequencyCalculator wordFrequencyCalculator = new WordFrequencyCalculator(fileName);
        wordFrequencyCalculator.calculateWordFrequency();
    }
}
