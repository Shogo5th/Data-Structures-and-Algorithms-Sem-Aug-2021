/*
Shogo Terashima
B2001046
 */
package StackandQueue;


public class LinkedStack <Type> implements StackInterface <Type> {
    
    private Node<Type> top = null; // refers to the first node of the linked list
    private int size = 0;
    
     public int size () {
         return size;
     }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public Type top(){
        if(isEmpty()){ return null;}
        
        return top.getElement();
    }
    
    // this is smillar to add first
    public void push (Type element) {
        Node newNode = new Node(element,top); // set next of newNode top
        top = newNode;  // change top to newNode
        size ++ ;
    }
    
    public Type pop () {
       if (isEmpty()){return null;} 
       
       Type ele = top.getElement(); // Element to be removed
       top = top.getNext(); // update top
        
       size--;
        
       return ele; 
    }
    
    
}
