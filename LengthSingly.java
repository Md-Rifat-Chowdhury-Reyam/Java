public class LengthSingly {

    static int lengthLink( Node head)
    {
        int count = 0;

        Node curr = head;

        while( curr != null)
        {
            count++;
            curr = curr.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(" Length of node "+ lengthLink(head));
    }
    
}
