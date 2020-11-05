public class BubbleSort {

    /*
     * Overloaded method of sort
     * In which default order of sorting is ascending.
    */
    public static void sort(int[] arr) {
        sort(arr, false);
    }

    /* 
     * Overloaded method of sort
     * In which you specify order of sorting.
    */
    public static void sort(int[] arr, boolean reverse) {
        int diff = reverse ? -1 : 1;
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (diff * arr[j] > diff * arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }
}