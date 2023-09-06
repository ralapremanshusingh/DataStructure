package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr={2,63,42,1,24,3};

        for(int i =1; i<arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                arr[j]=arr[j]+arr[j-1];
                arr[j-1]=arr[j]-arr[j-1];
                arr[j]=arr[j]-arr[j-1];
                j--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
