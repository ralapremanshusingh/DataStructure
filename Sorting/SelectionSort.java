package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
    int[] arr={7,1,2,3,4,5,6};

        for(int i=0; i<arr.length; i++) {
            int midIndex=i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[midIndex]>arr[j])
                    midIndex=j;
            }

            if(midIndex!=i) {
                arr[i]=arr[midIndex]+arr[i];
                arr[midIndex]=arr[i]-arr[midIndex];
                arr[i]=arr[i]-arr[midIndex];
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
