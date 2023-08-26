import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
       int[] arr={1, 2, 3, 9, 9, 32521};
       int l=0, h=arr.length-1;
       int result=-1;
       
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the Searchable Elements: ");
       int value=sc.nextInt();
       while(l<=h) {
        int mid=l+(h-l)/2;
        if(arr[mid]==value) {
            result = mid;
            h=mid-1;
        }
        else if(arr[mid]<value)
            l=mid+1;
        else if(arr[mid]>value)
            h=mid-1;
       }

       if(result==-1)
            System.out.println("Value is not exist.");
       else
            System.out.println("Your Searchable value first occurence is index no : " +result );
        sc.close();
    }
}
