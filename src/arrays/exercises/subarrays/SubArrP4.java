package arrays.exercises.subarrays;

public class SubArrP4 {
  public static void main(String[] args) {
    /* Dada uma matriz de N números onde uma submatriz é
     * classificada em ordem decrescente e o restante dos números
     * na matriz está em ordem crescente. A tarefa é classificar um
     * array onde um subarray de um array classificado está em ordem inversa.
     */
    
    int[] arr = new int[]{2, 5, 65, 55, 50, 70, 90};
    printSorted(arr);
  }
  
  public static void printSorted(int[] arr) {
    int front = -1, back = -1;
    
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        front = i - 1;
        break;
      }
    }
    
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > arr[i + 1]) {
        back = i + 1;
        break;
      }
    }
    
    if (front == -1 && back == -1) {
      for (int j : arr) {
        System.out.print(j + " ");
      }
      return;
    }
    
    while (front <= back) {
      int temp = arr[front];
      arr[front] = arr[back];
      arr[back] = temp;
      
      front++;
      back--;
    }
    
    for (int j : arr)
      System.out.print(j + " ");
  }
}
