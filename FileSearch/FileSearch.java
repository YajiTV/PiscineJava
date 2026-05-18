import java.io.File;
import java.util.Arrays;

public class FileSearch {
    public static String searchFile(String fileName) {
        if (fileName == null) {
            return null;
        }

        return searchFile(new File("documents"), fileName);
    }

    private static String searchFile(File folder, String fileName) {
        if (!folder.exists() || !folder.isDirectory()) {
            return null;
        }

        File[] files = folder.listFiles();
        if (files == null) {
            return null;
        }

        Arrays.sort(files);

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return file.getPath();
            }
        }

        for (File file : files) {
            if (file.isDirectory()) {
                String path = searchFile(file, fileName);
                if (path != null) {
                    return path;
                }
            }
        }

        return null;
    }
}
