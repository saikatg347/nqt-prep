import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // loop for text case 👇
    System.out.println("enter no of test cases : ");
    int t = in.nextInt();
    while(t-- > 0) {
      
      // taking user input 👇
      System.out.println("enter no of elements for test case ");
      int n = in.nextInt();
      System.out.println("Enter the elements : ");
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }

      // function call 👇
      System.out.println("The maximum no is : " + getMax(arr) );

    }
  }

  static int getMax(int[] arr) {
    int max = arr[0]; // 👈 variable to store the minimum element to far

    for(int i = 0; i < arr.length; i++) { // 👈 for loop to iterate over every element of the array on by one

      // if ith element is less than min then store that in min 👇`
      if(arr[i] > max) {
        max = arr[i];
      }
    }

    // after for loop ends min variable should contain the minimum variable 👇
    return max;
  } 

}