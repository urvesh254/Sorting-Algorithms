public class MergeSort {

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
        mergeSort(arr, 0, arr.length - 1, diff);
    }

    // Merge Sort Logic
    private static void mergeSort(int[] arr, int l, int h, int diff) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid, diff);
            mergeSort(arr, mid + 1, h, diff);
            merge(arr, l, mid, h, diff);
        }
    }

    // Merge Logic
    private static void merge(int[] arr, int l, int mid, int h, int diff) {
        int[] temp = new int[h - l + 1];
        int k = 0;
        int i = l, j = mid + 1;

        while (i <= mid && j <= h) {
            if (diff * arr[i] > diff * arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= h) {
            temp[k++] = arr[j++];
        }

        k = 0;
        for (i = l; i <= h; i++) {
            arr[i] = temp[k++];
        }
    }
}
