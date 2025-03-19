public class Searching {

    public static void main(String[] args) {
        
        int [] arr = {2,3,4,56,7};
        int search = 3;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] == search)
            {
                System.out.print("True"+" ");
            }
            else{
                System.out.print("False"+" ");
            }

        }
    }
    
}
