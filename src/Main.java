public class Main {
    public static void main(String[] args) {
        String fileName = "src/input.txt";
        PicnicAnalyzer picnicAnalyzer = new PicnicAnalyzer(fileName);
        FunctionSelector functionSelector = new FunctionSelector(picnicAnalyzer);
        functionSelector.selectFunction();
    }
}
