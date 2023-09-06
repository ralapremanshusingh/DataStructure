package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        if(num<0)
            num*=-1;

        int fact=factorial(num);

        System.out.println("Factorial is " + fact);

        sc.close();

    }

    public static int factorial(int num) {

        if(num==0)
            return 0;
        else if(num==1)
            return 1;
        else {
            return num * factorial(num-1);
        }
    }
}
