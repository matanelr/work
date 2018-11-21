public class BinarySearch {
    class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BinarySearch(){
        this.root = null;
    }

    public void insert(int item){

           insertHelper(item, root);


    }
    public Node insertHelper(int item, Node node){
        if (node == null){
            node = new Node(item);
            return node;
        }
        if (item < node.key){
            node.left = insertHelper(item, node.left);
        }
        else if(item > node.key){
            node.right = insertHelper(item, node.right);
        }
        return node;
    }
}
