import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

    public static String getContentFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
