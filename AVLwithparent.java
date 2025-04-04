public class AVLwithparent {
    int key;
    AVLwithparent left;
    AVLwithparent right;
    AVLwithparent par;
    int height;

    public AVLwithparent(int key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
        this.par = null;
        this.height = 1; // height of a new node is 1
    }
    
}
