import java.util.Arrays;

public class App{
    static int[][] transpose(int[][] mat, int row, int col)
    {
        int[][] tr = new int[col][row];
        for(int i = 0; i < row; i++)
        {
            for(int j= 0; j <col; j++)
            {
                tr[j][i] = mat[i][j];

            }
        }
        return tr;
    }

    static void sortRow(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            Arrays.sort(arr[i]);

        }
    }

    static void sortCol(int[][] mat, int r, int c)
    {
        int[][] arr = transpose(mat, r, c);
        sortRow(arr);

        mat = transpose(arr, r, c);

        for(int i =0 ; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.err.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat ={{111,2,5554},
    {443,4,55,632},{23423,3534,56}};

        int r = mat.length;
        int c = mat[0].length;
        sortCol(mat, r, c);

    }
}

