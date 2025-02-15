package HelloApp;

public class MdArrayClone {

    public static void main(String[] args) {
        
        int arr[][] ={{1,2,3}, {4,5,6}};

        int cloneArr[][] =arr.clone();

        // will print false 
        

        System.out.println(arr ==  cloneArr);

         // will print true
        System.out.println(arr[0] ==  cloneArr[0]);
        System.out.println(arr[1] ==  cloneArr[1]);
    }
    
}
