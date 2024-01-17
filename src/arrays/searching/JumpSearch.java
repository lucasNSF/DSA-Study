package arrays.searching;

public class JumpSearch {
  public static int search(int[] arr, int target) {
    int n = arr.length;
    int step = (int) Math.floor(Math.sqrt(n));
    int prev = 0;
    
    for (int minStep = Math.min(step, n) - 1; arr[minStep] < target; minStep = Math.min(step, n) - 1) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(n));
      
      if (prev >= n) return -1;
    }
    
    while (arr[prev] < target) {
      prev++;
      if (prev == Math.min(step, n)) return -1;
    }
    
    if (arr[prev] == target) return prev;
    
    return -1;
  }
}
