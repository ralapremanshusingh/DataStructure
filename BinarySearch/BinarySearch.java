import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr={1, 2, 3, 8, 9, 32521};
       int l=0, h=arr.length-1;
       
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the Searchable Elements: ");
       int value=sc.nextInt();
       while(l<=h) {
        int mid=l+(h-l)/2;
        if(arr[mid]==value) {
            System.out.println("Value is index no: " + mid);
            break;
        }
        else if(arr[mid]<value)
            l=mid+1;
        else if(arr[mid]>value)
            h=mid-1;
       }

       if(l>h)
            System.out.println("Value is not exist.");

        sc.close();
    }
}
