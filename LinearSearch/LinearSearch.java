import java.util.Scanner;
public class LinearSearch {
    
    Scanner sc1 = new Scanner(System.in);
        
    int[] takeArr(int[] b) {
        for(int i=0; i<b.length; i++)
            b[i]=sc1.nextInt();
        return b;
    }        

    void printArr(int[] d) {
        for(int i: d)
            System.out.print(i + " ");
        System.out.println();
        return;
    }

    boolean Searching(int[] arr, int j) {
        for(int i=0; i<arr.length; i++)
            if(j==arr[i]) {
                System.out.println("Your searchabel Elements is index no : " + i);
                return true;
            }
        return false;
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinearSearch ra = new LinearSearch();
        
        System.out.print("Enter Array Length : ");
        int l=sc.nextInt();
                
        int[] c = new int[l];
                
        System.out.print("Enter Array elements : ");
        c=ra.takeArr(c);
                
        System.out.print("Present Array ");
        ra.printArr(c);     
        
        System.out.print("Enter Searchable Element: ");
        int s=sc.nextInt();
        if(!ra.Searching(c, s))
            System.out.println("Your searchable element is not exist.");
        sc.close();
    }
    
}