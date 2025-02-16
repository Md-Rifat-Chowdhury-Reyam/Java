package Loop.Task;

import java.util.Scanner;

public class whileT {


     public static void main(String[] args) {
        
      
        Scanner inputt = new Scanner(System.in);

        System.out.println("Enter value  where u want to start ");
        int i1 = inputt.nextInt();

        System.out.println(" Enter the value where u want to stop ");
        int i2 =inputt.nextInt();

        while(i2>=i1)
        {
            System.out.println(i2);
            i2--;
        }


     }
    
}
