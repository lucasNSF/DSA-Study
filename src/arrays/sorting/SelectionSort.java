package arrays.sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = new int[]{64, 25, 12, 22, 11};
    sort(arr);
    
    for (int number : arr) {
      System.out.print(number + " ");
    }
  }
  
  public static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex])
          minIndex = j;
      }
      
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
