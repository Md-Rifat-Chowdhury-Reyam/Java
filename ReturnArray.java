package HelloApp;

public class ReturnArray {

    public static void main(String[] args) {
        
        int arr [] = method1();
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+ " ");
    }


    public static int[] method1(){

        return new int[] {1,2,3,4,5};

    }
    
}
