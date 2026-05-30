public class BinarySearch {

    public static int search(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    public static int upperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 7, 9};

        System.out.println("search(3) = " + search(arr, 3));
        System.out.println("lowerBound(3) = " + lowerBound(arr, 3));
        System.out.println("upperBound(3) = " + upperBound(arr, 3));
        System.out.println("lowerBound(4) = " + lowerBound(arr, 4));
    }
}
