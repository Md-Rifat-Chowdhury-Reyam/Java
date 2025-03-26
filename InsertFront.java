public class InsertFront {

    static Node intsertFront(Node head, int new_data)

    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;

    }

    static void printL(Node head)
    {
        Node curr = head;

        while(curr != null)
        {
            System.out.println(" "+ curr.data);
            curr = curr.next;

        }
        System.out.println(" ");
    }
    

    public static void main(String[] args) {
        
        Node head = new Node(3);
         head.next = new Node(4);
         head.next.next = new Node(5);
         

         System.out.println(" " );
         printL(head);

         int data = 1;
         head = intsertFront(head, data);
         System.out.println(" After new data insertion ");
         printL(head);
    }
}
