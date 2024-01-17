package arrays.searching;

public class TernarySearch {
    public static int iterativeSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) return mid1;
            if (arr[mid2] == target) return mid2;

            if (target < arr[mid1]) {
                right = mid1 - 1;
            } else if (target > arr[mid2]) {
                left = mid2 + 1;
            } else {
                right = mid2 - 1;
                left = mid1 + 1;
            }
        }

        return -1;
    }

    public static int recursiveSearch(int[] arr, int target) {
        return TernarySearch.auxRecursiveSearch(arr, target);
    }

    public static int auxRecursiveSearch(int[] arr, int target) {}

}
