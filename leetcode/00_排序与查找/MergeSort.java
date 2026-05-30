public class MergeSort {

    public static void sort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, tmp);
    }

    private static void mergeSort(int[] arr, int lo, int hi, int[] tmp) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(arr, lo, mid, tmp);
        mergeSort(arr, mid + 1, hi, tmp);
        merge(arr, lo, mid, hi, tmp);
    }

    private static void merge(int[] arr, int lo, int mid, int hi, int[] tmp) {
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= hi) tmp[k++] = arr[j++];
        for (int x = lo; x <= hi; x++) {
            arr[x] = tmp[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
