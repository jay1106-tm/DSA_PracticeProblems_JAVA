package Striver;
import java.util.*;

public class SelecetionSortGFG {
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		Solution selectionSort = new Solution();
		selectionSort.selectionSort(arr, size);
		System.out.println(Arrays.toString(arr));
	}
}

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int minIndex = i;
        for(int j = i+1; j<arr.length; j++) {
            if(arr[j]<arr[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i<n-1; i++) {
	        int index = select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[index];
	        arr[index] = temp;
	    }
	}
}
