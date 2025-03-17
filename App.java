import java.util.Arrays;

public class App {

    public static  void sortAr(int [][] arr)
    {
        for(int []row : arr)
        {
           Arrays.sort(row);
        }
    }

    public static void main(String[] args) {
        int [][] arr1 ={
            {77, 11, 22, 3},
            {11, 89, 1, 12},
            {32, 11, 56, 7},
            {11, 22, 44, 33}

        };

        sortAr(arr1);
        System.out.println(" [ ");
        for(int []row : arr1)
        {
            System.out.print( " [");
            for(int i =0; i<arr1.length; i++)
            {
                if(i>0)
                {
                    System.out.print(" ' ");
                }
                System.out.print(row[i]);
            }
            System.out.println(" ] ");

        }
    }
    

}
