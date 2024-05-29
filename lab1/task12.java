public class task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 12};
        boolean[] resultArray = getSumCheckArray(array);

        for (boolean b : resultArray) {
            System.out.print(b + " ");
        }
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] resultArray = new boolean[array.length];

        resultArray[0] = false;
        resultArray[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                resultArray[i] = true;
            } else {
                resultArray[i] = false;
            }
        }

        return resultArray;
    }
}