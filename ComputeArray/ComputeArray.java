public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int val = array[i];

            if (val % 3 == 0) {
                result[i] = val * 5;
            } else if (val % 3 == 1) {
                result[i] = val + 7;
            } else {
                result[i] = val;
            }
        }

        return result;
    }
}