package Recursion;

public class Multiple {
    public static void main(String[] args) {
        int a=23, t=5;

        printMultiple(a,t);
        System.out.println();    
    }

    private static void printMultiple(int a, int i) {
        if(i==1) {
            System.out.println(a);
            return;
        }

        printMultiple(a, i-1);
        System.out.println(a*i);   
        
    }

}
