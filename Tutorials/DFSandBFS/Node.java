/*
Shogo Terashima
B2001046
 */

package DFSandBFS;

public class Node {
    private int element;
    private  Node left;
    private  Node right;
    
    Node(int element) {
        this.element = element;
    }
    
    public int getElement(){
        return element;
    }
    
    public Node getRight() {
        return right;
    }
    
    public Node getLeft() {
        return left;
    }
    
    public void setRight(Node node) {
        this.right = node;
    }
    
    public void setLeft(Node node) {
        this.left = node;
    }
}
