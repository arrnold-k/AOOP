import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TextFileAnalyzerTest {

    @Test
    public void testAnalyzeSmallFile() throws IOException {
        // Create a small text file
        File file = new File("small.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Hello World\nThis is a test");
        writer.close();

        TextFileAnalyzer analyzer = new TextFileAnalyzer();
        analyzer.analyzeFile("small.txt");

        // Check the word count and line count
        assertEquals(4, analyzer.getWordCount());
        assertEquals(2, analyzer.getLineCount());

        // Delete the file
        file.delete();
    }

    @Test
    public void testAnalyzeLargeFile() throws IOException {
        // Create a large text file
        File file = new File("large.txt");
        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < 1000; i++) {
            writer.write("Hello World\n");
        }
        writer.close();

        TextFileAnalyzer analyzer = new TextFileAnalyzer();
        analyzer.analyzeFile("large.txt");

        // Check the word count and line count
        assertEquals(2000, analyzer.getWordCount());
        assertEquals(1000, analyzer.getLineCount());

        // Delete the file
        file.delete();
    }

    @Test
    public void testInvalidInput() {
        TextFileAnalyzer analyzer = new TextFileAnalyzer();

        // Test with a non-existent file
        assertThrows(FileNotFoundException.class, () -> analyzer.analyzeFile("non_existent.txt"));

        // Test with a null file path
        assertThrows(NullPointerException.class, () -> analyzer.analyzeFile(null));
    }
}