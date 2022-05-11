/*
Shogo Terashima
B2001046
 */
package DFSandBFS;


public class BFS {
    public void execBfs(Node root, int size) {
        if (root == null) {
            System.out.println("Nothing to print because input tree is null.");
        }
        
        ArrayQueue<Node> queue = new ArrayQueue<Node>(size);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            System.out.println(node.getElement());
            if (node.getLeft() != null) {
                queue.enqueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enqueue(node.getRight());
            }
        }
    }
}
