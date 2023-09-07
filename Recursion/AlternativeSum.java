package Recursion;

public class AlternativeSum {
    public static void main(String[] args) {
        int num=9;

        int result=alternativeSum(num);

        System.out.println("Result is " + result);
    }

    private static int alternativeSum(int num) {
        if(num==1)
            return num;

        if(num%2==0)
            return alternativeSum(num-1)-num;
        else
            return alternativeSum(num-1)+(num);
    }
}
