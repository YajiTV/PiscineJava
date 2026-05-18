import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            return;
        }

        byte[] buffer = new byte[4096];

        try (FileOutputStream output = new FileOutputStream(args[0])) {
            int bytesRead;
            while ((bytesRead = System.in.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        }
    }
}
