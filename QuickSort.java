public class QuickSort {

    /* 
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
        quickSort(arr, 0, arr.length - 1, diff);
    }

    // Quick Sort Logic
    private static void quickSort(int[] arr, int l, int h, int diff) {
        if (l < h) {
            int j = partition(arr, l, h, diff);
            quickSort(arr, l, j - 1, diff);
            quickSort(arr, j + 1, h, diff);
        }
    }

    // Partiton Login in Quick Sort 
    private static int partition(int[] arr, int l, int h, int diff) {
        int pivot = l;
        int i = l, j = h;
        while (i < j) {
            while (i < h && diff * arr[pivot] >= diff * arr[i]) {
                i++;
            }
            while (j > l && diff * arr[pivot] <= diff * arr[j]) {
                j--;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        if (j > l) {
            int t = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = t;
        }

        return j;
    }

}
