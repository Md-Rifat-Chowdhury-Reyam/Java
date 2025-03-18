import java.time.Duration;
import java.time.Instant;

public class App
{
     static void rowWise(int[][] arr)
     {
        int r = arr.length;
        int c= arr[0].length;

        for(int i = 0 ; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j]++;
            }

        }
     }

     static void colWise(int [][]arr)
     {
        int r= arr.length;
        int c = arr[0].length;

        for(int j = 0; j< c; j++)
        {
            for(int i = 0; i < r; i++ )
            {
                arr[i][j]++;

            }

        }

     }

     public static void main(String[] args) {
        int n = 1000;
        int [][] arr= new int[n][n];

        Instant start = Instant.now();
        rowWise(arr);
        Instant end = Instant. now();
        System.out.println("Row check time "+ Duration.between(start, end));


        start = Instant.now();
        colWise(arr);
        end = Instant.now();
        System.out.println("Col check in "+ Duration.between(start, end));
     }
}