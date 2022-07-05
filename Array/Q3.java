public class Q3 {

  public static void main(String[] args) {
    int arr[] = {5, 2, 1, 3, 4};

    int min = arr[0];

    int secMin;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
        secMin = 
      }
    }
  }



  static void selectionSort(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int minIn = i;

      for(int j = i; j < arr.length; j++) {
        if(arr[j] < min) {
          min = arr[j];
          minIn = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[minIn];
      arr[minIn] = temp;
    }
  }
}
