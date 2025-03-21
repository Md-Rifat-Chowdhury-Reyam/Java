import java.util.ArrayList;

public class StackDynamic {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

       
        System.out.println("popped element " + arr.get(arr.size()-1));
        arr.remove(arr.size()-1);


        System.out.println("The peek element is now "+ arr.get(arr.size()-1));

        for(int i= 0; i < arr.size(); i++ )
        {
            System.out.print(arr.get(i)+ " ");
        }

        System.out.print("Elements present in stack: ");
        while (!arr.isEmpty()) {
            System.out.print(arr.get(arr.size() - 1) + " ");
            arr.remove(arr.size() -1);
            
            
           
        }
    }
    
}
