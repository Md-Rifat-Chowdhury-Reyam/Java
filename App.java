public class App {

    public static Node insert(Node root, int data)
    {
        if (root == null) {
            root = new Node(data);
            
        }
        else
        {
            root.right = insert(root, data);
        }
        return root;
    }


    public static void printTree(Node node)

    {
        if(node !=  null)
        {
            System.out.println(node.data + "  hello");
            printTree(node.right);

        }
    }


   public static void main(String[] args) {
    
   

    Node root = new Node(1);
    insert(root, 2);
    insert(root, 3);
    printTree(root);
   }
        
}