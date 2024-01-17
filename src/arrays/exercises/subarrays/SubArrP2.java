package arrays.exercises.subarrays;

public class SubArrP2 {
  public static void main(String[] args) {
    /*  Dado um array de inteiros positivos e negativos e um número K,
     *  a tarefa é verificar se algum subarray com produto K está presente no array ou não.
     */
    
    int[] arr1 = new int[]{-2, -1, 3, -4, 5};
    int[] arr2 = new int[]{3, -1, -1, -1, 5};
    int[] arr3 = new int[]{1, 2, -5, -4};
    
    System.out.println("Case 1:");
    System.out.println(preResolution(arr1, 2));
    
    System.out.println("Case 2:");
    System.out.println(preResolution(arr2, 3));
    
    System.out.println("Case 3:");
    System.out.println(hasProduct(arr3, 20));
  }
  
  public static String hasProduct(int[] arr, int k) {
    int product = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      product *= arr[i];
      if (product == k) return "YES";
    }
    
    return "NO";
  }
  
  public static String preResolution(int[] arr, int k) {
    int minVal = arr[0];
    int maxVal = arr[0];
    
    int maxProduct = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < 0) {
        int temp = maxVal;
        maxVal = minVal;
        minVal = temp;
      }
      
      maxVal = Math.max(arr[i], maxVal * arr[i]);
      minVal = Math.min(arr[i], minVal * arr[i]);
      
      if (minVal == k || maxVal == k) return "YES";
      
      maxProduct = Math.max(maxProduct, maxVal);
    }
    
    return "NO";
  }
}
