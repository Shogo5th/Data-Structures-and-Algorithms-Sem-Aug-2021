/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q2;

public class BST{
    static class Node {
       private int key; // key value
       private String data; // data
       private Node left; // left node
       private Node right; // right node
       
       // constructor 
       Node(int key, String data, Node left, Node right) {
           this.key = key;
           this.data = data;
           this.left = left;
           this.right = right;
       }
       
       // return key value
       int getKey() {
           return key;
       }
       
       // return data 
       String getValue() {
           return data;
       }
       
       // display data
       void print() {
           System.out.println(data);
       }
    }
    
    private Node root; // node
    
    // constructor 
    public BST() {
        root = null;
    }
   
    // compare key 
    private int compare( int key1, int key2){
        if(key1 > key2){
            return 1;
        }else if(key1 < key2) {
            return -1;
        }else {
            return 0;
        }
    }
    
    void addNode(Node node, int key, String data) {             //  if key is already exist
        int cond = compare(key, node.getKey());
        if(cond == 0){
            return;
        }else if(cond < 0){
            if(node.left == null) {
                node.left = new Node(key, data, null, null);   // left side
            }else {
                addNode(node.left, key, data);
            }
        }else {                                                 // right side
            if(node.right == null){
                node.right = new Node(key, data, null, null);
            }else {
                addNode(node.right, key, data);
            }
        }
    }
    
    // insesrt node
    public void add(int key, String data) {
        if(root == null) {
            root = new Node(key, data, null, null);
        }else {
            addNode(root, key, data);
        }
    }
    
    // search data of key 
    public String search(int key) {
        Node s = root;
        
        while(true) {                       
            if(s == null){return null;}     // if it cant be go anymore, failed and return null
            
            int cond = compare(key, s.getKey()); // compare key and key value of the node
            if (cond == 0) {                // if it equl
                return s.getValue();        // search success 
            }else if(cond < 0) {
                s = s.left;                 // if key is smaller, search left side
            }else {                         
                s = s.right;
            }
        }
    }
    
    // remove node 
    public boolean remove(int key) {
        Node s = root;                          
        Node parent = null;                    
        boolean isLeft = true;                   // is s left child node ?
        
        while(true) {
            if(s == null) {return false;}       // if it cant go anymore the key doesnt exist 
            int cond = compare(key, s.getKey());   
            if(cond == 0){break;}               //  if key and key value of node s is equal
            else{                               
                parent = s;                     // set parent
                if(cond < 0) {
                    isLeft = true;              // go left
                    s = s.left;
                }else {
                    isLeft = false;             // go right
                    s = s.right;
                }
            }
        }
        
        if(s.left == null) {                    // if no left 
            if(s == root) {
                root = s.right;
            }else if(isLeft){
                parent.left = s.right;          // parent left pointer 
            }else {
                parent.right = s.right;         // parent right pointer 
            }
        }else if(s.right == null) {             // if s doesnt have right child
            if(s == root) {
                root = s.left;
            }else if(isLeft){
                parent.left = s.left;           // parent left pointer
            }else {
                parent.right = s.left;          // parent left pointer
            }
        }else {                                 // maximum
            parent = s;                         
            Node left = s.left;
            isLeft = true;
            while(left.right != null) {
                parent = left;
                left = left.right;
                isLeft = false;
            }
            s.key = left.key;
            s.data = left.data;
            
            if(isLeft){
                parent.left = left.left;
            }else {
                parent.right = left.left;
            } 
        }
        return true;
    }
    
    // show all nodes
    private void printSubTree(Node node) {              
        if(node != null) {
            printSubTree(node.left);    // Left part in ascending key order
            System.out.println(node.key + " " + node.data );
            printSubTree(node.right);   // right part in ascending key order
        }
    }
    
    public void print() {
        printSubTree(root);
    }
    
}
