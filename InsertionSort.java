import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        Solution insertionSort = new Solution();
        insertionSort.insertionSort(arr, size);
        System.out.print(Arrays.toString(arr));
    }
}

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int j = 0;
       while(j<i) {
           if(arr[i]<arr[j]) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
           j++;
       }
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 1; i<n; i++) {
          insert(arr,i);
      }
  }
}
