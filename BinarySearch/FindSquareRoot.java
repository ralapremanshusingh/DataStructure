import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number which yoy want to Square root: ");
        int square=sc.nextInt();

        int result = findSquareRoot(square);
        System.out.println("Square root of " + square + " is " + result + ".");
        sc.close();
    }

    public static int findSquareRoot(int square) {
        int l=0, h=square, result=-1;
        while(l<=h) {
            int mid=l+(h-l)/2;
            int value=mid*mid;
            if(value==square)
                return mid;
            else if(value<square) {
                result=mid;
                l=mid+1;
            }
            else
                h=mid-1;
            
        }

        return result;
    }
}
