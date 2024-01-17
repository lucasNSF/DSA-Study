package arrays.searching;

// O (log N)
public class Binary {
    public static int iterativeSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == target) return middle;

            if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static int recursiveSearch(int[] arr, int target) {
        return Binary.auxRecursiveSearch(arr, 0, arr.length, target);
    }

    private static int auxRecursiveSearch(int[] arr, int left, int right, int target) {
        int middle = left + (right - left) / 2;

        if (arr[middle] == target) return middle;

        if (arr[middle] < target) {
            return Binary.auxRecursiveSearch(arr, middle + 1, right, target);
        }

        return Binary.auxRecursiveSearch(arr, left, middle - 1, target);
    }
}
