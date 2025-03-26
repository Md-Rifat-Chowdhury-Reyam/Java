public class LeftSkewed {

    public static class  Node {
        int key;
        Node left;
        static Node newNode(int key)
        {
            Node temp = new Node();
            temp.key = key;
            temp.left = null;
            return temp;
        }

        public static void main(String[] args) {
            
            Node root = newNode(1);
            root.left = newNode(2);
            root.left.left = newNode(3);

            
        }
    
        
    }
    
}
