package AVL;

public class Node {

    int  key;
    Node left;
    Node right;
    int height;

    Node(int k)
    {
        this.key = k;
        this.left = null;
        this.right = null;

        this height = 1;
        
    }
    
}
