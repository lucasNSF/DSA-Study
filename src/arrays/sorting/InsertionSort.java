package arrays.sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = new int[]{12, 11, 13, 5, 6};
    
    sort(arr);
    
    for (int number : arr)
      System.out.print(number + " ");
  }
  
  public static void sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;
      
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }
      
      arr[j + 1] = temp;
    }
  }
}
