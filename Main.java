import java.util.Arrays;

public class Main
   {

    static int[][] transpose(int[][] mat, int row, int col)
    {
        int[][]tr = new int[col][row];

        for(int i = 0; i < row; i++)
        {
            for(int j =0; j < col; j++)
            {
                tr[j][i] = mat[i][j];

            }
        }
        return tr;
    }

    static void sortRow(int[][] arr)
    {
        for(int i = 0; i < (int)arr.length; i++ )
        {
            Arrays.sort(arr[i]);
        }
    }
    static void sortCol(int[][]mat, int r, int c)
    {
        int[][] arr = transpose(mat, r, c);
        sortRow(arr);

        mat = transpose(arr, c, r);

        for(int i = 0; i < r; i++)
        {
            for( int j = 0; j < c; j++)
            {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] mat = { { 1, 6, 10, 5, 9},
        { 8, 5, 9,5, 9 },
        { 9, 4, 15,5, 9 },
        { 9, 4, 15,5, 9 },
        { 7, 3, 60,5, 9 } };

        int r = mat.length;
        int c = mat[0].length;

        sortCol(mat, r, c);

    }
   }