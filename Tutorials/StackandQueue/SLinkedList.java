/*
Shogo Terashima
B2001046
 */

package StackandQueue;

public class SLinkedList<Type> {
    
    private Node<Type> head; // refers to the first node of the linked list
    private Node<Type> tail;
    
    private int size;
    boolean flag; // for outbounding
    

    public SLinkedList() {
        head = tail = null;
        
        size = 0;
    }   
    
    public Node<Type> getHead(){
        return head;
    }
    
    public Node<Type> getTail(){
        return tail;
    }
    
    // traverse list and get n th node. n = integer inputted by user 
    public Node<Type> getAt(int at){
        if(at >= size || at < 0){
            return null;
        }else{
            Node temp = head;
            for(int i =0; i < at; i++){
                temp = temp.getNext();
            }
            return temp;
        }

        
    }
    
    public void setHead(Node<Type> newHead){
        head = newHead;
    }
    
    public void setTail(Node<Type> newTail){
        head = tail;
    }
    
    
    public int getSize(){
        return size;
    }
    
    public void setSize(int num){
        size = num;
        
    }

    public boolean isEmpty(){
        boolean isNull = false;
        if(size == 0){
            isNull =  true;
        }
        return isNull;
    }
    
    
    // adding element at the front of linked list
    public void addFront(Type ele){
        Node newNode = new Node(ele);
        newNode.setNext(head);
        
        if(isEmpty()){
            tail = newNode;
        }
        head = newNode;
        
        size++;

    }
    
    public void addLast(Type ele){
        Node newNode = new Node(ele);

        if(isEmpty()){
            head = newNode;
            tail = head;
            
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
        
        size++;
    }
    
    // traverse list and add 
    public void addAt(Type ele, int at){
        if(at > size || at < 0){ // can add element next of last index whicis index = size
            System.out.println("Error: index out bound");
        }else if(at == size){ // if  at=0 size =0;
            addLast(ele);
            
        }else if(at == 0){
            addFront(ele);
        }
        else{
             Node before = getAt(at-1);
    
             Node newNode = new Node(ele);
                
             newNode.setNext(before.getNext());
             before.setNext(newNode);
                
             size++;
            
        }

        
        

    }

    public Type removeFirst(){
        
        if(isEmpty()){return null;}
        Type ele = head.getElement(); // Element to be removed
        head = head.getNext(); // update head
        
        size--;
        
        return ele; 
    
    }

    public Type removeLast(){
        
        if(isEmpty()){return null;}
        Type ele = tail.getElement(); // Element to be removed
        
        if(size == 1){
            removeFirst();
        }
        else{
            // traverse list and get last node
            tail = getAt(size-2); // index is start from 0
            tail.setNext(null);
            size--;
        }
        
        
        return ele; 
    
    }

    // remove a node with the specified index
    public Type removeAt(int at){
        if(isEmpty()){return null;}
    
    
        if(at >= size || at < 0){ //  example: size = 2, index are 0 and 1, index = 2 is out bound
            System.out.println("Error: index out bound");
            return null;
        }
        else{
            Type ele = getAt(at).getElement(); // Element to be removed
         
            if(size == 1 || at == 0){removeFirst();}
            else if(at == size-1){removeLast();}
            else{
                Node before = getAt(at-1);
                before.setNext(before.getNext().getNext());
                size --;

            }
        return ele;
        }


    }
    

    
}