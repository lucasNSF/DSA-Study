package arrays.exercises.subarrays;

public class SubArrP1 {
  public static void main(String[] args) {
    /* Divida uma matriz em duas submatrizes de soma iguais
     * Dado um array de inteiros maiores que zero, descubra se é
     * possível dividi-lo em dois submatrizes (sem reordenar os elementos),
     * de modo que a soma dos dois submatrizes seja a mesma.
     * Imprima as duas submatrizes.
     */
    
    int[] arr1 = new int[]{1, 2, 3, 4, 5, 5};
    int[] arr2 = new int[]{4, 1, 2, 3};
    int[] arr3 = new int[]{4, 3, 2, 1};
    
    System.out.println("Case 1");
    printSolution(arr1);
    
    System.out.println("\nCase 2");
    printSolution(arr2);
    
    System.out.println("\nCase 3");
    printSolution(arr3);
  }
  
  public static int splitArrInTwoEqualSums(int[] arr) {
    int leftSum = 0;
    
    for (int number : arr) leftSum += number;
    
    int rightSum = 0;
    
    for (int i = arr.length - 1; i >= 0; i--) {
      rightSum += arr[i];
      leftSum -= arr[i];
      
      if (rightSum == leftSum) return i;
    }
    
    return -1;
  }
  
  public static void printSolution(int[] arr) {
    int splitPoint = splitArrInTwoEqualSums(arr);
    
    if (splitPoint == -1 || splitPoint == arr.length) {
      System.out.println("Not Possible");
      return;
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (splitPoint == i) System.out.println();
      System.out.print(arr[i] + " ");
    }
  }
}
