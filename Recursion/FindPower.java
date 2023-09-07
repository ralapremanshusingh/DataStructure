package Recursion;

public class FindPower {
    public static void main(String[] args) {
        int num=2, power=4;
        int result=findPower(num,power);
        System.out.println("Result is " + result);
    }

    private static int findPower(int num, int power) {
        while(power>0) {
            if(power==1)
                return num;
            else { 
                int result = findPower(num, power/2);
                if(num%2==0)
                    return result*result;
                else
                    return num*result*result;
            }
        }        
        return -1;
    }
}
