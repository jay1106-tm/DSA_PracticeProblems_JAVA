import java.util.*;
class QuickSortGFG {
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		Solution quickSort = new Solution();
		quickSort.quickSort(arr, 0, size-1);
		System.out.println(Arrays.toString(arr));
	}
}

class Solution
{
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high) {
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
        }
    }
    int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j) {
            while(i<=high-1 && arr[i] <= pivot) i++;
            while(j>=low+1 && arr[j]>pivot) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    } 
}