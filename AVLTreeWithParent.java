public class AVLTreeWithParent {

    public static void updateHeight(AVLTreeWithParent root)
    {
        if( root != null)
        {
            int leftHeight = (root.left != null) ? root.left.height : 0;
            int rightHeight = (root.right != null) ? root.right.height : 0;
            root.height = Math.max (leftHeight, rightHeight) + 1; 
        }
    }
    
}
