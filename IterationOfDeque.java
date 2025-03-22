import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class IterationOfDeque {

    public static void main(String[] args) {
        Deque< String> d =  new ArrayDeque<>();

        d.add("Rifat");
        d.addFirst("Md");
        d.addLast("Chowdhury");
        d.add("is an Engineer.");

        for(Iterator<String> it = d.iterator();

        it.hasNext();
        )
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        for(Iterator<String> it = d.descendingIterator(); 
        it.hasNext();
        ){
            System.out.print(it.next()+" ");

        }

        
    }
    
}
