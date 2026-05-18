import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length < 2) {
            return;
        }

        try (
            FileReader reader = new FileReader(args[0]);
            FileWriter writer = new FileWriter(args[1])
        ) {
            boolean newWord = true;
            boolean pendingSpace = false;
            boolean hasWritten = false;
            int character;
            while ((character = reader.read()) != -1) {
                char current = (char) character;

                if (current == ' ') {
                    if (hasWritten) {
                        pendingSpace = true;
                    }
                    continue;
                }

                if (Character.isWhitespace(current)) {
                    writer.write(current);
                    pendingSpace = false;
                    newWord = true;
                    hasWritten = false;
                    continue;
                }

                if (pendingSpace) {
                    writer.write(' ');
                    pendingSpace = false;
                    newWord = true;
                }

                if (!Character.isWhitespace(current)) {
                    if (newWord) {
                        writer.write(Character.toUpperCase(current));
                        newWord = false;
                    } else {
                        writer.write(Character.toLowerCase(current));
                    }
                    hasWritten = true;
                }
            }
        }
    }
}
