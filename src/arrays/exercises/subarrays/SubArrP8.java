package arrays.exercises.subarrays;

/**
 * Dado um array arr[] de N inteiros e outro inteiro K .
 * A tarefa é encontrar a soma máxima de uma subsequência
 * tal que a diferença dos índices de todos os elementos consecutivos
 * na subsequência na matriz original seja exatamente K.
 * Por exemplo, se arr[i] for o primeiro elemento da subsequência,
 * então o próximo elemento deverá ser arr[i + k] , então arr[i + 2k] e assim por diante.
 */

public class SubArrP8 {
  public static void main(String[] args) {
    int[] arr = new int[]{2, -3, -1, -1, 2};
    
    System.out.println("Case 1:");
    System.out.println(find(arr, 3));
    
    System.out.println("Case 2:");
    System.out.println(find(arr, 2));
  }
  
  public static int maxSumSeparatedByK(int[] arr, int k, int index) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    
    while (index < arr.length) {
      currSum += arr[index];
      
      if (maxSum < currSum)
        maxSum = currSum;
      
      if (currSum < 0)
        currSum = 0;
      
      index += k;
    }
    
    return maxSum;
  }
  
  public static int find(int[] arr, int k) {
    int maxSum = 0;
    
    for (int i = 0; i <= Math.min(arr.length, k); i++) {
      maxSum = Math.max(maxSum, maxSumSeparatedByK(arr, k, i));
    }
    
    return maxSum;
  }
}
