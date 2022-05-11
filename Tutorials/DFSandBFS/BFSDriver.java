/*
Shogo Terashima
B2001046
 */
package DFSandBFS;

public class BFSDriver {
    
    public static void main(String[] args) {
        
        int size = 10;
        
        Node root = new Node(0);

        root.setLeft(new Node(1));
        
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(4));

        root.setRight(new Node(2));
        root.getRight().setLeft(new Node(5));
        root.getRight().setRight(new Node(6));

        new BFS().execBfs(root, size);
    }
    
}
