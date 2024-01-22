package arrays;

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    /*
     * Dado um array (ou string), a tarefa é reverter o array/string.
     */
    
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = new int[]{4, 5, 1, 2};
    
    System.out.println("Case 1:");
    Arrays.stream(reverseArrRecursive(arr1)).forEach(System.out::print);
    
    System.out.println("\nCase 2:");
    Arrays.stream(reverseArrRecursive(arr2)).forEach(System.out::print);
  }
  
  public static int[] reverseArrIterative(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      
      start++;
      end--;
    }
    
    return arr;
  }
  
  public static int[] reverseArrRecursive(int[] arr) {
    auxReverseArr(arr, 0, arr.length - 1);
    return arr;
  }
  
  private static void auxReverseArr(int[] arr, int start, int end) {
    if (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      auxReverseArr(arr, start + 1, end - 1);
    }
  }
}
