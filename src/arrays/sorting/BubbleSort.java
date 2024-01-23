package arrays.sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = new int[]{64, 25, 12, 22, 11};
    sort(arr);
    
    for (int number : arr) {
      System.out.print(number + " ");
    }
  }
  
  public static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
