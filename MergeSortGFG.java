package Striver;
import java.util.*;

public class MergeSortGFG {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        Solution mergeSort = new Solution();
        mergeSort.mergeSort(arr, 0, size-1);
        System.out.print(Arrays.toString(arr));
    }
}

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1 = m-l+1;
         int n2 = r-m;
         int[] temp1 = new int[n1];
         int[] temp2 = new int[n2];
         for(int i = 0; i<n1; i++) temp1[i] = arr[l+i];
         for(int i = 0; i<n2; i++) temp2[i] = arr[m+1+i];
         int i = 0;
         int j = 0;
         int k = l;
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
         while(i<n1) {
             arr[k] = temp1[i];
             i++;
             k++;
         }
         while(j<n2) {
             arr[k] = temp2[j];
             j++;
             k++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return;
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
