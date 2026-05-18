public class CleanExtract {
    public static String extract(String s) {
        if (s == null) {
            return null;
        }

        String[] parts = s.split("\\|", -1);
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            String extracted;
            int firstDot = part.indexOf('.');

            if (firstDot == -1) {
                extracted = part;
            } else {
                int lastDot = part.lastIndexOf('.');
                if (firstDot == lastDot) {
                    extracted = part.substring(firstDot + 1);
                } else {
                    extracted = part.substring(firstDot + 1, lastDot);
                }
            }

            String cleaned = extracted.trim();
            if (!cleaned.isEmpty()) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(cleaned);
            }
        }

        return result.toString();
    }
}
