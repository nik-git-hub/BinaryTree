package ua.skillsup.binarytree;

public class TreeSet {

    private Node root;
    private int size;
    private boolean isElement;

    public void add(Object value) {
        if ( value == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e){
                System.out.println("\nThe value must not be equals null.");
                return;
            }
        }
        if (root == null) {
            root = new Node(value);
            size++;
            return;
        }

        add(root, value);
    }

    private void add(Node current, Object value) {
        if (value == current.getValue()) {
            current.setValue(value);
            return;
        }

        if (value.hashCode() < current.getValue().hashCode()) {
            addLeft(current, value);
        } else if (value.hashCode() > current.getValue().hashCode()) {
            addRight(current, value);
        }
    }

    private void addLeft(Node current, Object value) {
        if (current.getLeft() != null) {
            add(current.getLeft(), value);
        } else {
            current.setLeft(new Node(value));
            size++;
        }
    }

    private void addRight(Node current, Object value) {
        if (current.getRight() != null){
            add(current.getRight(), value);
        } else{
            current.setRight(new Node(value));
            size++;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object value) {
        if (isEmpty()){
            return false;
        }

        isElement = false;

        find(root, value);

        return isElement;
    }

    private void find(Node current, Object value) {
        if (value.equals(current.getValue())) {
            isElement = true;
            return ;
        }

        if (value.hashCode() < current.getValue().hashCode()) {
            if (current.getLeft() != null) {
                find(current.getLeft(), value);
            }
        } else if (value.hashCode() > current.getValue().hashCode()) {
            if (current.getRight() != null) {
                find(current.getRight(), value);
            }
        }

    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Set is empty.");
            return;
        }
        System.out.println("\n");
        display(root);
    }

    private static void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.print(" " + node.value);
            display(node.right);
        }
    }

    class Node {

        private Object value;
        private Node left;
        private Node right;

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
