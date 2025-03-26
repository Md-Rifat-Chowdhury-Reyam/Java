public class ModifyLinkedList {

     static Node reserveNode(Node head)
     {
        Node prev = null;
        Node curr = head;

        Node next = null;

        while(curr != null)

        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
     }

     static Node modifyTheList( Node head)

     {
        if(head.next == null )
        {
            return head;
        }

        Node slow = head;
        Node fast = head;
        Node mid;

        while (fast.next != null && fast.next.next != null)

        {

            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;

        Node reverList = mid.next;
        mid.next = null;

        reverList = reserveNode(reverList);
        Node curr1 =  head;
         Node curr2 = reverList;

         while (curr2 != null)
         {
            int new_data = curr1.data;
            curr1.data = curr2.data;
            curr2.data = new_data;
            curr1 = curr1.next;
            curr2 = curr2.next;
            
         }
         mid.next = reserveNode(reverList);

        return head;
     }

     public static void printListMo(Node node)
     {
         Node curr = node;
         while(curr != null)
         {
             System.out.println(curr.data + " ");
             curr = curr.next;
         }
     }


     public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next= new Node(33);

        head = modifyTheList(head);
        printListMo(head);
        

     }
}
