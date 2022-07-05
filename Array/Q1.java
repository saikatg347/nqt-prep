import java.util.*;

public class Q1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    while(t > 0) {
      
      int n = in.nextInt();
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }

      System.out.print( getMin(arr) );
      
      t--;
    }
  }

  static int getMin(int[] arr) {
    int min = arr[0];
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
      }
    }

    return min;
  } 

}