public class SearchSingly {

    public static boolean SearchKey(Node head, int el)
    {   
        Node curr = head;

        while (curr != null)
        {
            if(curr.data == el)
            {
                return true;
            }
            curr  = curr.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node nn = new Node(10);
        nn.next = new Node(20);
        nn.next.next= new Node(30);
        nn.next.next.next = new Node(40);


        int el = 10;
        if(SearchKey(nn, el))
        {
            System.out.println(" Found");
        }

        else{
            System.out.println("Not found");
        }
       


    }
    
}
