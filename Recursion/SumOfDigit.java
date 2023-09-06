package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int num=123456;

        int result= sumOfDigit(num);

        System.out.println("Sum of Digit is " + result);
    }

    private static int sumOfDigit(int num) {
        if(num<=0)
            return num;
        else 
            return (num%10) + sumOfDigit(num/10);
    }
}
