import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

    
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();

        hs.add("Md");
        hs.add("Rifat");
        hs.add("Chowdhury");

        System.out.println("The element of this HashSet" + hs );


        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+ " , ");
        }

        System.err.println();

        for(String el : hs)
        {
            System.out.println(el + " ");
        }
    }
}