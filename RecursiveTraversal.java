public class RecursiveTraversal {

    static void RecursiveTraversallist(Node head)
    {

        if(head == null)
        {
            System.out.println(" ");
            return;
        }
        System.out.println(head.data + " ");

        RecursiveTraversallist(head.next);

    }
    
    public static void main(String[] args) {
        Node he = new Node(10);
       he.next = new Node(20);
        RecursiveTraversallist(he);
    }
}
