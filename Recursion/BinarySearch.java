package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 8, 9, 32521};
        int l=0, h=arr.length-1, value=9;
        int result = search(arr,l,h,value);
        System.out.println("The value is index no : " +result);
    }

    private static int search(int[] arr, int l, int h, int value) {
            while(l<=h) {
            int mid=l+(h-l)/2;
            if(arr[mid]==value) {
                return mid;
            }
            else if(arr[mid]<value)
                return search(arr,mid+1, h, value);
            else if(arr[mid]>value)
                return search(arr, l, mid-1, value);
        }  
         return -1;
    
    }
}
