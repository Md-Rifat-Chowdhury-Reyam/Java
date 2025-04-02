package AVL;
public class AVLinsertion {

    static int height(Node N)

    {
        if(N == null)
        {
            return 0;

        }
        return N.height;
    }

    static Node rightRotate( Node y)
    {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;


        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    static Node LeftRotatio(Node x)
    {
        Node y = x.left;
        Node T2 = y.right;

        y.left = x;
        x.right = T2;

        x.height = 1+ Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height (y.left), height(y.right));
         return y;
    }

    
}
