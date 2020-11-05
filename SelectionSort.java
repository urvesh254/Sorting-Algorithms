public class SelectionSort {

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

        for (int i = 0; i < arr.length - 1; i++) {
            int change = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (diff * arr[change] > diff * arr[j])
                    change = j;
            }

            if (change != i) {
                int temp = arr[change];
                arr[change] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
