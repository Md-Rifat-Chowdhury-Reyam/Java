public class AVLTreeWithParent 
{

    public static void updateHeight(AVLwithparent root)
    {
        if( root != null)
        {
            int leftHeight = (root.left != null) ? root.left.height : 0;
            int rightHeight = (root.right != null) ? root.right.height : 0;
            root.height = Math.max (leftHeight, rightHeight) + 1; 
        }
    }

    public static  AVLwithparent LLRotation(AVLwithparent root)
    {
        AVLwithparent tempNode = root.left;
        root.left = tempNode.right;

        if(tempNode.right != null)
        { 
            tempNode.right.par = root;
        }

        tempNode.right = root;
        tempNode.par = root.par;
        root.par = tempNode;

        if(tempNode.par != null)
        {
            if(root.key < tempNode.par.key)
            {
                tempNode.par.left = tempNode;
            }
            else{
                tempNode.par.right = tempNode;
            }
            
        }
        updateHeight(root);
        updateHeight(tempNode);
        return tempNode;
    }


    public static AVLwithparent RRRotation(AVLwithparent root)
    {
        AVLwithparent tempNode = root.right;
        root.right = tempNode.left;

        if(tempNode.left != null)
        {
            tempNode.left.par = root;
        }

        tempNode.left = root;
        tempNode.par = root.par;
        root.par = tempNode;
   
        if(tempNode.par != null)
        {
            if(root.key < tempNode.par.key)
            {
                tempNode.par.left = tempNode;
            }
            else{
                temNode.par.right = tempNode;
            }
        }

        updateHeight(root);
        updateHeight(temNode);
        return tempNode;
    }

    public static AVLwithparent LRRotation(AVLwithparent root)
    {
        root.left = RRRotation(root.left);
        return LLRotation(root);

    }

    public static AVLwithparent RLRotation(AVLwithparent root)
    {
        root.right = LLRotation(root.right);
        return RRRotation(root);
    }
  

    public static AVLwithparent insert(AVLwithparent root, AVLwithparent parent, int key)
    {

        if(root == null)
        {
            root = new AVLwithparent(key);
            root.par = parent;
        }

        else if ( root.key > key)
        {
            root.left = insert (root.left, root, key );

            int leftHeight = (root.left != null) ? root.left.height : 0;
            int rightHeight = (root.right != null) ? root.right.height : 0;
            if(Math.abs(leftHeight - rightHeight) == 2)
            {
                if(key < root.left.key)
                {
                    root = LLRotation(root);
                }
                else{
                    root = LRRotation(root);
                }
            }
        }
        else if ( root.key < key)
        {
            root.right = insert(root.right,root,key);
            int leftHeight = (root.left != null) ?  root.left.height : 0;
            int rightHeight = ( root.right != null) ? root.right.height : 0;
            if(Math.abs(leftHeight - rightHeight) == 2)
            {
                if(key < root.right.key)
                {
                    root = RLRotation(root);
                }
                else{
                    root = RRRotation(root);
                }
                
            }
        }

        updateHeight(root);
        return root;

    }

    public static void  printPreOrder(AVLwithparent root)
    {
        if( root != null)
        {
            String parentKey = ( root.par != null) ? Integer.toString(root.par.key) : "null";
            System.out.println("Node: " + root.key + ", Parent Node: " + parentKey + ", Height: " + root.height);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public static void main(String[] args) {
        AVLwithparent root = null;
        int [] keys = {10, 20, 30, 40, 50, 25};
        for (int key : keys)
        {
            root = insert(root, root, key);
        }
        System.out.println("Preorder traversal of the constructed AVL tree is: ");
        printPreOrder(root);    
    }

        
}

