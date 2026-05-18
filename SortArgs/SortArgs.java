import java.util.Arrays;
public class SortArgs {
    public static void sort(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <numbers.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(numbers[i]);
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
}
