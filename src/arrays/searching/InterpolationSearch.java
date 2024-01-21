package arrays.searching;

public class InterpolationSearch {
  public static int iterativeSearch(int[] arr, int key) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right && key >= arr[left] && key <= arr[right]) {
      if (left == right) {
        if (arr[left] == key) {
          return left;
        } else {
          return -1;
        }
      }
      
      int pos = left + ((key - arr[left]) * (right - left)) / (arr[right] - arr[left]);
      
      if (arr[pos] == key) {
        return pos;
      } else if (arr[pos] < key) {
        left = pos + 1;
      } else {
        right = pos - 1;
      }
    }
    
    return -1;
  }
  
  public static int recursiveSearch(int[] arr, int key) {
    return auxRecursiveSearch(arr, key, 0, arr.length - 1);
  }
  
  private static int auxRecursiveSearch(int[] arr, int key, int low, int high) {
    int pos;
    
    if (low <= high && key >= arr[low] && key <= arr[high]) {
      pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
      
      if (arr[pos] == key) return pos;
      
      if (arr[pos] < key) return auxRecursiveSearch(arr, key, pos + 1, high);
      return auxRecursiveSearch(arr, key, low, pos - 1);
    }
    
    return -1;
  }
}
