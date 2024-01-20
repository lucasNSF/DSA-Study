package arrays.exercises.subarrays;

public class SubArrP7 {
  public static void main(String[] args) {
    /* Dadas duas matrizes A[] e B[] consistindo em MN inteiros.
     * A tarefa é verificar se o array B[] é um subarray do array A[] ou não.
     */
    
    int[] arr1 = new int[]{2, 3, 0, 5, 1, 1, 2};
    int[] arr2 = new int[]{1, 2, 3, 4, 5};
    
    System.out.println("Case 1:");
    System.out.println(hasSubArr(arr1, new int[]{3, 0, 5, 1}));
    
    System.out.println("Case 2:");
    System.out.println(hasSubArr(arr2, new int[]{2, 5, 6}));
  }
  
  public static boolean hasSubArr(int[] source, int[] target) {
    int targetIndex = 0;
    
    for (int j : source) {
      if (j == target[targetIndex]) {
        targetIndex++;
      } else {
        targetIndex = 0;
      }
      
      if (targetIndex == target.length - 1)
        return true;
    }
    
    return false;
  }
}
