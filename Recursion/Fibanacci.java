package Recursion;

import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        int result=fibanacci(num);

        System.out.println("Fibanacci number is " + result);
        sc.close();
    
    }

    public static int fibanacci(int num) {
        if(num<=1)
            return num;

        else {
            return fibanacci(num-1) + fibanacci(num-2);
        }
       
    }
}
