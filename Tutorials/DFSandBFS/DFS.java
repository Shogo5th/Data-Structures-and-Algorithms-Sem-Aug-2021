/*
Shogo Terashima
B2001046
 */

package DFSandBFS;

public class DFS {
    
    public void execDFS(Node root , int size) {
        
        if(root == null) {
            System.out.println("Nothing to print because input tree is null");
        }
    
        ArrayStack<Node> stack = new ArrayStack<Node>(size);
    
        stack.push(root);
        
        // push nodes
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.getElement());
            
            if(node.getRight() != null) {
                stack.push(node.getRight());
            }
            
            if(node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }
    

}
