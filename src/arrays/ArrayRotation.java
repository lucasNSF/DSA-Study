package arrays;

public class ArrayRotation {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
    
    rotateOneByOne(arr1, 2);
    rotateWithTempArr(arr1, 2);
  }
  
  public static void rotateOneByOne(int[] arr, int amount) {
    for (int i = 0; i < amount; i++) {
      int last = arr[0];
      
      for (int j = 0; j < arr.length - 1; j++) {
        arr[j] = arr[j + 1];
      }
      
      arr[arr.length - 1] = last;
    }
    
    for (int number : arr) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
  
  public static void rotateWithTempArr(int[] arr, int amount) {
    int[] rotatedArr = new int[arr.length];
    int j = 0;
    
    for (int i = amount; i < arr.length; i++) {
      rotatedArr[j] = arr[i];
      j++;
    }
    
    for (int i = 0; i < amount; i++) {
      rotatedArr[j] = arr[i];
      j++;
    }
    
    arr = rotatedArr;
    
    for (int number : arr) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}
