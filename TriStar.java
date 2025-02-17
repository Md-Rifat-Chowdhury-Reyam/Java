 package Loop.Task;

 public class TriStar
 {


    public static void printS(int n)
    {
        for(int i=0; i<n;i++)
        {
            for(int j=(n-i);j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("1 ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=10;
        printS(n);
        
    }
 }