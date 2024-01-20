package arrays;

public class Kadane {
  public static void main(String[] args) {
    int[] arr1 = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
    int[] result = getMaxSumInContiguousArray(arr1);
    
    System.out.printf("MAX_SUM: %d\n", result[0]);
    
    for (int i = result[1]; i <= result[2]; i++) {
      System.out.print(arr1[i] + " ");
    }
    
    System.out.println("\n#########################");
    
    int[] p1 = problem1(arr1);
    
    System.out.printf("MAX_PRODUCT: %d\n", p1[0]);
    
    for (int i = p1[1]; i <= p1[2]; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
  
  public static int[] getMaxSumInContiguousArray(int[] arr) {
    int[] resolution = new int[3];
    
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    int start = 0, end = 0, s = 0;
    
    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      
      if (maxSum < currSum) {
        maxSum = currSum;
        start = s;
        end = i;
      }
      
      if (currSum < 0) {
        currSum = 0;
        s = i + 1;
      }
    }
    
    resolution[0] = maxSum;
    resolution[1] = start;
    resolution[2] = end;
    
    return resolution;
  }
  
  /**
   * Dado um array de inteiros (possivelmente alguns elementos negativos),
   * escreva um programa para descobrir o produto máximo possível
   * multiplicando 'n' inteiros consecutivos no array onde n ? ARRAY_SIZE.
   * Além disso, imprima o ponto inicial da submatriz máxima do produto.
   */
  public static int[] problem1(int[] arr) {
    int[] result = new int[3];
    
    int maxProduct = 1, currProduct = 1;
    int start = 0, end = 0, size = 0;
    
    for (int i = 0; i < arr.length; i++) {
      currProduct *= arr[i];
      
      if (maxProduct < currProduct) {
        maxProduct = currProduct;
        start = size;
        end = i;
      }
      
      if (currProduct < 0) {
        currProduct = 1;
        size = i + 1;
      }
    }
    
    result[0] = maxProduct;
    result[1] = start;
    result[2] = end;
    
    return result;
  }
}
