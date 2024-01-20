package arrays.exercises.subarrays;

public class SubArrP6 {
  public static void main(String[] args) {
    /*
     * Dada uma matriz de caracteres arr[] contendo apenas
     * alfabetos ingleses minúsculos, a tarefa é imprimir o
     * comprimento máximo da submatriz de modo que o primeiro
     * e o último elemento da submatriz sejam iguais.
     */
    
    char[] arr1 = new char[]{'g', 'e', 'e', 'k', 's'};
    char[] arr2 = new char[]{'a', 'b', 'c', 'd', 'a'};
    
    System.out.println("Case 1:");
    System.out.println(maxLengthSubArr(arr1));
    
    System.out.println("Case 2:");
    System.out.println(maxLengthSubArr(arr2));
  }
  
  public static int maxLengthSubArr(char[] arr) {
    Element[] elements = new Element[26];
    
    for (int i = 0; i < arr.length; i++) {
      int ch = arr[i] - 'a';
      
      if (elements[ch] == null)
        elements[ch] = new Element();
      
      elements[ch].updateIndex(i);
    }
    
    int maxLen = 0;
    for (int i = 0; i < 26; i++) {
      if (elements[i] != null) {
        int len = elements[i].lastOcc - elements[i].firstOcc + 1;
        maxLen = Math.max(len, maxLen);
      }
    }
    
    return maxLen;
  }
}

class Element {
  int firstOcc, lastOcc;
  
  public Element() {
    firstOcc = lastOcc = -1;
  }
  
  public void updateIndex(int index) {
    if (firstOcc == -1)
      firstOcc = index;
    
    lastOcc = index;
  }
}
