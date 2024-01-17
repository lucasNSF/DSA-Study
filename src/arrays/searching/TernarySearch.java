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
        return TernarySearch.auxRecursiveSearch(arr, target, 0, arr.length - 1);
    }

    private static int auxRecursiveSearch(int[] arr, int target, int left, int right) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            
            if (arr[mid1] == target) return mid1;
            if (arr[mid2] == target) return mid2;
            
            if (target < arr[mid1]) {
                return auxRecursiveSearch(arr, target, left, mid1 - 1);
            } else if (target > arr[mid2]) {
                return auxRecursiveSearch(arr, target, mid2 + 1, right);
            }
            
            return auxRecursiveSearch(arr, target, mid1 + 1, mid2 - 1);
        }
        
        return -1;
    }
}
