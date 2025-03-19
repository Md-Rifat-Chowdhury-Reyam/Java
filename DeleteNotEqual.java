public class DeleteNotEqual {

    static int  remove(int[] arr, int el)
    {
        int k = 0;

        for(int i = 0; i < arr.length; i++ )
        {
            if(arr[i] != el)
            {
                arr[k] = arr[i];
                k++;

            }
        }
        return k;
    
    } 

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,6};
        int el = 3;
        System.out.println(remove(arr, el));
    }

}
