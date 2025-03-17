import java.util.Arrays;

public class Main{

    public static void sortA(int [][] arr)
    {
        for(int [] row : arr)
        {
            Arrays.sort(row);
        }
    }

    public static void main(String[] args) {
        int [][] arr =  {
            {77, 11, 22, 3},
            {11, 89, 1, 12},
            {32, 11, 56, 7},
            {11, 22, 44, 33}
        };

        sortA(arr);


        System.out.println(" .. ");
        for (int [] row : arr)
        {
            System.out.println(" ' ");
            for(int i =0; i< arr.length; i++)
            {
                if(i>0)
                {
                    System.out.print(",");
                }
                System.out.print(row[i]);
            }
        }
    }
    
}