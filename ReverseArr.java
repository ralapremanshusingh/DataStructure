import java.util.Scanner;
public class ReverseArr {
   
    int[] reverseArr(int[] a) {
        for(int i=0, j=a.length-1; i<j; i++, j--) {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
        }
        return a;
    }
    
    int[] takeArr(int[] b) {
        Scanner sc1 = new Scanner(System.in);
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

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ReverseArr ra = new ReverseArr();
        
        System.out.print("Enter Array Length : ");
        int l=sc.nextInt();
        
        int[] c = new int[l];
                
        System.out.print("Enter Array elements : ");
        c=ra.takeArr(c);
                
        System.out.print("Befor Reverse : ");
        ra.printArr(c);
        
        c=ra.reverseArr(c);
        System.out.print("After Reverser : ");
        ra.printArr(c);
        System.out.println();
        
        
        
    }
}