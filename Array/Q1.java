import java.util.*;

public class Q1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // loop for text case 👇
    int t = in.nextInt();
    while(t > 0) {
      
      // taking user input 👇
      int n = in.nextInt();
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }

      // function call 👇
      System.out.print( getMin(arr) );
      
      t--;
    }
  }

  static int getMin(int[] arr) {
    int min = arr[0]; // 👈 variable to store the minimum element to far

    for(int i = 0; i < arr.length; i++) { // 👈 for loop to iterate over every element of the array on by one

      // if ith element is less than min then store that in min 👇`
      if(arr[i] < min) {
        min = arr[i];
      }
    }

    // after for loop ends min variable should contain the minimum variable 👇
    return min;
  } 

}