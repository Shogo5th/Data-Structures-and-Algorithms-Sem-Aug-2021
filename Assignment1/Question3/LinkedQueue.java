/*
Shogo Terashima
B2001046
 */
 
package Question3;

import Question1.Node;

public class LinkedQueue <Type> implements QueueInterface <Type> {
    
    private Node <Type> head = null; // refers to the first node of the linked list
    private Node <Type> tail = null;
    private int size = 0;
    
     public int size () {
         return size;
     }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public Type first(){
        if(isEmpty()){ return null;}
        
        return head.getElement();
    }
    
    
    public void enqueue (Type element) {
        Node newNode = new Node(element);
        if(isEmpty()){
            head = newNode; // change head to newNode
        }else{
            tail.setNext(newNode); // change tail.next to newNode
        }
        
        tail = newNode; // newNode will be tail
        size ++ ;
    }
    
    public Type dequeue () {
       if (isEmpty()){return null;} 
       
       Type element = head.getElement(); // Element to be removed
       head = head.getNext(); // update top
        
       size--;
       
       if (size == 0) {
           tail = null;
       }
        
       return element; 
    }
    
        
        
}
