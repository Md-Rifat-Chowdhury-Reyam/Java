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
  
}
