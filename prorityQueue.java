import java.util.PriorityQueue;

public class prorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
    
    
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(6);
        p.add(7);
        p.add(4);
        p.add(2); 

        System.out.println(p);
    
        System.out.println("the head of queue "+ p.peek());
    }
    
}
