public class AVLinsertion 
{

    static int height(Node N)

    {
        if(N == null)
        {
            return 0;

        }
        return N.height;
    }

    static Node RightRotation( Node y)
    {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;


        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    static Node LeftRotation(Node x)
    {
        Node y = x.left;
        Node T2 = y.right;

        y.left = x;
        x.right = T2;

        x.height = 1+ Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height (y.left), height(y.right));
         return y;
    }

    static int getBalance(Node N)
    {
        if (N == null)
        {
            return 0;

        }
        return height(N.left) - (N.right);
    }

    static Node insert( Node node, int key)
    {
        if( node == null)
        {
            return (new Node(key));
        }

        if(key < node.key)
        {
            node.left = insert(node.left, key);
        }

        if(key > node.key)
        {
            node.right = insert (node.right, key);

        }

        else{
            retun node;

        }

        node.height = 1 + Math.max (height(node.left), height(node.right));
        int balance = getBalance(node);


        if( balance > 1 && key < node.left.key )
        {
            return RightRotation(node);
        }

        if(balance < -1 && key > node.right.key)
        {
            return  LeftRotation(node);
        }

        if(balance > 1 && key > node.left.key)
        {
            node.left = LeftRotation(node.left);
            return RightRotation(node);
        }

        if(balance < -1 && key < node.right.key)
        {
            node.right = RightRotation(node.right);
            return LeftRotation(node);
        }
        return node;

        
    }    
    static void preOrder(Node root)
        {
            if(root != null)
            {
                System.out.println(root.key + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
    



    public static void main(String[] args) {

        Node root = null;
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 4);
        root = insert(root, 2); 
        root = insert(root, 1);

        System.out.println(" order " + preOrder(root));
        
    }

    
}
