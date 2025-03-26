public class InsertAny {

     static Node insertData(Node head, int pos, int data)
     {
        if(pos < 1)
        {
            return head;
        }


        if(pos == 1)
        {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;

        }

        Node curr = head;

        for(int i = 0 ; i < pos - 1 && curr != null; i++)
        {
            curr = curr.next;
        }

        if (curr == null)
        {
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
     }

     static void printList(Node node)
     {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
                    
        }
        System.out.println();
     }

     public static void main(String[] args) {
        
        Node head = new Node(3);

        head.next = new Node(5);

        int data = 33;
        int pos = 2;

        head = insertData(head, pos, data);

        printList(head);
     }
    
}
