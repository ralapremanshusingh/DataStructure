package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,6,4,7,4};

        for(int i=0; i<arr.length; i++) {
            boolean swapped=false;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                    swapped=true;
                }
            }  
            if(!swapped)
                break;          
        }
        for (int j : arr)
            System.out.print(j + " ");
    }
}
