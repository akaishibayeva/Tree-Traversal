public class Node {

    int data; // this is the value of a node
    Node left, right;

    public Node () {
        left = right = null;
        data = 0;
    }

    public Node (int n) {
        left = right = null;
        data = n;
    }

    public void setData(int d) {
        data = d;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public void setRight(Node n) {
        right = n;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
