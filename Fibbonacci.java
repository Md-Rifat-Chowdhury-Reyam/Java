public class Fibbonacci {

    static int minimum(int x, int y)
    {
        return (x <= y) ? x : y; //Ternary operator  If the condition is true, the value of x is returned; otherwise, the value of y is returned. This ensures that the smaller of the two integers is always returned.
    }

    
    static int fibbonacci(int[]arr, int x, int n)
    {
        int fibN2 = 0;
        int fibN1 = 1;
        int fibM = fibN1+ fibN2;
        
        while(fibM < n)
        {
            fibN2 = fibN1;
            fibN1 = fibM;
            fibM = fibN2 + fibN1;

        }

        int offset = -1;
        
        while(fibM > 1)
        {
            int i = minimum(offset + fibN2, n-1);

            if( arr[i] < x)
            {
                fibM = fibN1;
                fibN1 = fibN2;
                fibN2 = fibM - fibN1;
                offset = i;
            }

            else if( arr[i] > x)
            {
                fibM = fibN1;
                fibN1 = fibN1 -fibN2;
                fibN2 = fibM - fibN1;
            }

            else {return i;}

            if(fibN1 == 1 && arr[n-1] == x)
            {
                return n-1;

            }
          
        }
        return -1;

    }

    public static void main(String[] args) {
        
        {
            int arr[] = { 10, 22, 35, 40, 45,  50,
                          80, 82, 85, 90, 100, 235 };
            int n = 12;
            int x = 235;
            int index = fibbonacci(arr, x, n);
            if (index >= 0)
                System.out.print("Element found at index: "
                                 + index);
            else
                System.out.print(
                    x + " isn't present in the array");
        }
    }
}
