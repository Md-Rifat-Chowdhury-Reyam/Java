package Loop.Task;

import java.util.Scanner;

public class tableNumber {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("Want to table number :");
        int Tn = input.nextInt();

        int sM;

        for(sM=10; sM>=1; sM--)
        {
            int result = Tn*sM;
            System.out.println(Tn+" "+" * "+ sM+ " = "+ result);
        }
    }
    
}
