public class App
{
    static boolean  searchMetrix(int [][] arr, int x)
    {
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(arr[i][j] == x)
                {
                    return true;
                }
            }
            
        }return false;

        
    }

    public static void main(String[] args) {
        int x = 3;
        int [][]arr ={{1,2,3},{4,3,5},{2,34,5}};
        if (searchMetrix(arr, x))
         {

            System.out.println("True "+ x + " in the array"+ arr.length);
        }
        else{
            System.out.println("");
        }
    }
}