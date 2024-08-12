import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileAnalyzer {

    private int wordCount;
    private int lineCount;

    public void analyzeFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            wordCount = 0;
            lineCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            scanner.close();

            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }
}