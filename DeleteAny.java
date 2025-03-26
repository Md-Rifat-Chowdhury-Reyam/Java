public class DeleteAny {

    static Node deleteNode(Node head, int pos)
    {
        Node temp = head;
        Node prev = null;


        if(temp == null)
        {
            return head;
        }

        if (pos == 1)
        {
            head = temp.next;
            return head;
        }

        for(int i = 0; temp != null && i < pos; i++)
        {
            prev = temp;

            temp = temp.next;
        }

        if(temp != null )
        {
            prev.next = temp.next;
        }
        else{ System.out.println("");}

        return head;
    }

    static void printListD(Node head)
    {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;

            
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next = new Node(3);


        printListD(head);System.out.println("Above are list ");

        int pos = 1;
        head = deleteNode(head, pos);

        printListD(head);
    }
    
}
