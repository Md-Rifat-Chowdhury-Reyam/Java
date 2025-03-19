public class ReverseTA {

    public static void main(String[] args) {
        char [] arr = {'R','I','F', 'A','T'};
        int row = arr.length;

         for(int i = row - 1; i >= 0; i--)
         {
            System.out.print(arr[i]+ " ");
         }
    }
    
}
