
package BST;

public class BSTDriver {
    
    public static void main(String[] args){
        
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(6);
        bst.insert(2);
        bst.insert(9);
        bst.insert(1);
        bst.insert(4);
        bst.insert(8);
        
       // bst.preOrder();
        bst.inOrder();
        
        
    }
    
}
