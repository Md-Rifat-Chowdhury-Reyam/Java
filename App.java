import java.time.Duration;
import java.time.Instant;

public class App
{
    static void rowWise(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0; i <row; i++)
        { for(int j = 0; j< col; j++)
            {
                arr[i][j]++;
            }
         
        
        }
    }


    static void colWise(int[][] arr)
    {
        int row =arr.length;
        int col = arr[0].length;

        for(int i = 0; i< col; i++)
        {
            for( int j = 0; j< row  ; j++)
            {
                arr[i][j]++;

            }
        }
    }


    public static void main(String[] args) {
        
        int n = 1000;
        int [][] arr = new int[n][n];

        Instant start = Instant.now();
        rowWise(arr);
        Instant end = Instant.now();
        System.out.println("Row access time "+ Duration.between(start, end));

         start = Instant.now();
        colWise(arr);
         end = Instant.now();
        System.out.println("Column access time"+ Duration.between(start, end));
    }
}