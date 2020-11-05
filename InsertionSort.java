public class InsertionSort {

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

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = diff * arr[i];
            while (j > -1 && diff * arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = diff * temp;
        }
    }

}
