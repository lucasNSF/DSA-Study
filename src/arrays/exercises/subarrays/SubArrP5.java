package arrays.exercises.subarrays;

public class SubArrP5 {
  public static void main(String[] args) {
    /*
     * Dado um array de N inteiros e um número K,
     * a tarefa é encontrar o número de submatrizes
     * tais que todos os elementos sejam maiores que K nele.
     */
    
    int[] arr1 = new int[]{3, 4, 5, 6, 7, 2, 10, 11};
    int[] arr2 = new int[]{8, 25, 10, 19, 19, 18, 20, 11, 18};
    
    System.out.println("Case 1:");
    System.out.println(countSubArrays(arr1, 5));
    
    System.out.println("Case 2:");
    System.out.println(countSubArrays(arr2, 13));
  }
  
  public static int countSubArrays(int[] arr, int k) {
    int count = 0;
    int number = 0;
    
    for (int element : arr) {
      if (element > k) {
        count++;
      } else {
        number += (count) * (count + 1) / 2;
        count = 0;
      }
    }
    
    if (count != 0)
      number += (count) * (count + 1) / 2;
    
    return number;
  }
}
