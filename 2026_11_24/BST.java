public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public void add(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = root;

        while (current != null) {
            parent = current;
            if (current.getData() > data) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }

        if (parent.getData() > data)
             parent.setLeft(newNode);
        else
            parent.setRight(newNode);
    }

    public boolean isEmpty() {

        return root == null;
    }

    private void inOrder(Node root) {

        if (root == null)
            return;
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());


    }
    
    public void inOrder() {

        inOrder(root);
    }
    
}
