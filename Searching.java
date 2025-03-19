public class Searching {

    public static void main(String[] args) {
        
        int [] arr = {2,3,4,56,7};
        int search = 3;
        boolean found = false;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] == search)
           {
            found = true;
           }

        }

        if (found) {
            System.out.println(" Founded");
            
        }
        else
        {
            System.out.println(" Not ");
        }
    }
    
}
