package Loop.Task;

import java.util.Scanner;

public class ReversePyramid {

    
    public static void printedValue(int n)
    { 
       

        int i,j;

        for( i=0;i<n;i++)
        {
            for( j=2*(n-i); j>=0; j--)
            {

             System.out.print(" ");
            }
            
            for(j=0; j<=i;j++)
            {
             System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
     {
        Scanner nr = new Scanner(System.in);
        int n = nr.nextInt();
        printedValue(n);
       
    }
}