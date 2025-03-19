import java.util.ArrayList;
import java.util.Arrays;

public class InsertBeginning
{
    public static void main(String[] args) {

       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4));
       
       int element =  1;


       arr.add(0,element);

       for(int i = 0 ; i < arr.size(); i++)
       {
        System.out.println(" "+arr.get(i));
       }
    }
}