package arrays.sorting;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = new int[]{12, 11, 13, 5, 6, 7};
    
    sort(arr);
    
    for (int number : arr)
      System.out.print(number + " ");
  }
  
  public static void sort(int[] arr) {
    int length = arr.length;
    if (length <= 1) return;
    
    int middle = length / 2;
    
    int[] leftArr = new int[middle];
    int[] rightArr = new int[length - middle];
    
    int j = 0;
    for (int i = 0; i < length; i++) {
      if (i < middle) {
        leftArr[i] = arr[i];
      } else {
        rightArr[j] = arr[i];
        j++;
      }
    }
    
    sort(leftArr);
    sort(rightArr);
    merge(leftArr, rightArr, arr);
  }
  
  private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
    int leftSize = arr.length / 2;
    int rightSize = arr.length - leftSize;
    int i = 0, l = 0, r = 0;
    
    while (l < leftSize && r < rightSize) {
      if (leftArr[l] < rightArr[r]) {
        arr[i] = leftArr[l];
        l++;
      } else {
        arr[i] = rightArr[r];
        r++;
      }
      i++;
    }
    
    while (l < leftSize) {
      arr[i] = leftArr[l];
      l++;
      i++;
    }
    
    while (r < rightSize) {
      arr[i] = rightArr[r];
      r++;
      i++;
    }
  }
}
