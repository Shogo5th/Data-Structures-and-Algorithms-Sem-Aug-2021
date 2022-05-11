
package BST;

public class BinarySearchTree {
    
    BSTNode root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    // isEmpty
    boolean isEmpty(){
        return (root==null);
    }
    
    void insert(int key){
        if(isEmpty()){
            root = new BSTNode(key); // root node of BST
        } else {
            insert(key,root);
        }
    }
    
    private void insert(int key, BSTNode node){
        
        // new node needs to be added to left subtree
        if(key < node.key){
            if(node.left == null){
                node.left = new BSTNode(key); // base case 
            } else {
                insert(key,node.left); // go to left subtree; // recursive call
            }            
        } else {            
            if(node.right==null) {
                node.right = new BSTNode(key); // base case
            } else {
                insert(key,node.right);  // recursive call
            } 
        }
    }
    
    
    void preOrder(){
        if(isEmpty())
            System.out.println("Empty Tree");
        else
            preOrder(root);
    }
    private void preOrder(BSTNode node) { // NLR
        if(node!=null){        
            System.out.print(node.key + "  ");
            preOrder(node.left);
            preOrder(node.right);
        }
        
    }
    
    void inOrder(){
        if(isEmpty())
            System.out.println("Empty Tree");
        else
            inOrder(root);
    }
    private void inOrder(BSTNode node) { // LNR
        if(node!=null){        
            
            inOrder(node.left);
            System.out.print(node.key + "  ");
            inOrder(node.right);
        }
        
    }
    
    // TODO : Delete Node 
    
}
