

public class BinarySearch 
{

    static int biserach(int[] arr, int rowLow, int rowhigh, int el)
    {
        

        if(rowhigh < rowLow)
        {
            return -1;
        }

         int rowMid =  (rowLow + rowhigh) / 2 ;
         if(el == arr[rowMid] )
         {
            return rowMid;

         }

         if(el > arr[rowMid])
         {
             return biserach(arr, rowMid + 1 , rowhigh, el);
             
             
         }
         return biserach(arr, rowLow , rowMid - 1, el);

        

    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,56,7};

        int rowIndex = arr. length -1;
        int el = 7;

        System.out.println("Index "+ biserach(arr, 0, rowIndex,el));
        
    }
    
}
