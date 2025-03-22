import java.util.ArrayDeque;
import java.util.Deque;

public class DEQueue {
    public static void main(String[] args) {
         Deque<String> d = new ArrayDeque<>();

         d.addLast("1");
         d.addLast("2");
         d.addLast("3");

         String f = d.removeFirst();
         String l = d.removeLast();

         System.out.println("First deque "+ f + " Last deque "+ l);
    }
    
}
