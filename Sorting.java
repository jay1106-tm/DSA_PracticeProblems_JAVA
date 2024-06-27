package Striver;
import java.util.*;
public class Sorting {
    /*private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }*/
    @SuppressWarnings("unused")
    private static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++) {
            int min_index = i;
            for(int j = i+1; j<n; j++) {
                if(arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    @SuppressWarnings("unused")
    private static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    @SuppressWarnings("unused")
    private static void insertion_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            /*int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }*/
            for(int j = i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    private static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];
        for(int i = 0; i<n1; i++) temp1[i] = arr[low+i];
        for(int i = 0; i<n2; i++) temp2[i] = arr[mid+1+i];
        int i = 0;
        int j = 0;
        int k = low;
        while(i<n1 && j<n2) {
            if(temp1[i]<temp2[j]){
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = temp1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }
    @SuppressWarnings("unused")
    private static void merge_sort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = low+(high-low)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    private static void quick_sort(int[] arr, int low, int high) {
        if(low<high) {
        int pivot = partition(arr,low,high);
        quick_sort(arr,low,pivot-1);
        quick_sort(arr,pivot+1,high);
    
        }    
    }
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i<n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    //selection_sort(arr);
	    //bubble_sort(arr);
	    //insertion_sort(arr);
	    //merge_sort(arr,0,n-1);
	    quick_sort(arr,0,n-1);
	    System.out.println(Arrays.toString(arr));
	}
}