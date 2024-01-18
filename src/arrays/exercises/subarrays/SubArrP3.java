package arrays.exercises.subarrays;

public class SubArrP3 {
  public static void main(String[] args) {
    /* Dado um array arr[], um inteiro K e uma soma.
     * A tarefa é verificar se existe algum subarranjo com
     * K elementos cuja soma seja igual à soma dada.
     * Se qualquer submatriz com tamanho K tiver a soma igual à soma fornecida,
     * imprima SIM, caso contrário, imprima NÃO.
     */
    
    int[] arr1 = new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20};
    
    System.out.println("Case 1:");
    System.out.println(getResolution(arr1, 4, 18));
    
    System.out.println("Case 2:");
    System.out.println(getResolution(arr1, 3, 6));
  }
  
  //  Inefficient code - O(K * N)
  public static int indexSumOfKElements(int[] arr, int k, int sum) {
    for (int i = 0; i < arr.length; i++) {
      int steps = k - 1;
      int sumAux = arr[i];
      
      for (int j = i + 1; steps > 0; j++) {
        sumAux += arr[j];
        steps--;
      }
      
      if (sumAux == sum) return i;
    }
    
    return -1;
  }
  
  //  Efficient Code - O(N)
  public static int slidingWindow(int[] arr, int k, int sum) {
    int currentSum = 0;
    int index = 0;
    
    while (index < k) {
      currentSum += arr[index];
      index++;
    }
    
    if (currentSum == sum) return index;
    
    for (int i = k; i < arr.length; i++) {
      currentSum = currentSum - arr[i - k] + arr[i];
      
      if (currentSum == sum) return i;
    }
    
    return -1;
  }
  
  public static String getResolution(int[] arr, int k, int sum) {
//    int index = indexSumOfKElements(arr, k, sum);
    int index = slidingWindow(arr, k, sum);
    if (index == -1) return "NO";
    
    int steps = k;
    for (int i = index; steps > 0; i--) {
      System.out.printf("%d ", arr[i]);
      steps--;
    }
    
    System.out.println();
    
    return "YES";
  }
}
