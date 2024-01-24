package arrays.sorting;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = new int[]{8, 3, 25, 2, 4, 9, 8};
    quickSort(arr);
    
    for (int number : arr) {
      System.out.print(number + " ");
    }
  }
  
  public static void quickSort(int[] arr) {
    auxQuickSort(arr, 0, arr.length - 1);
  }
  
  private static void auxQuickSort(int[] arr, int start, int end) {
    if (end <= start) return;
    int pivot = partition(arr, start, end);
    auxQuickSort(arr, start, pivot - 1);
    auxQuickSort(arr, pivot + 1, end);
  }
  
  private static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;
    
    for (int j = start; j <= end - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[end] = temp;
    
    return i;
  }
}
