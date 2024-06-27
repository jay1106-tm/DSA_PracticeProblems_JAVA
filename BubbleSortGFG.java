import java.util.*;

public class BubbleSortGFG {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        Solution bubbleSort = new Solution();
        bubbleSort.bubbleSort(arr, size);
        System.out.print(Arrays.toString(arr));
    }
}

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
