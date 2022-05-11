
package DLL;

public class DLinkedList <Type> {
    
    private DLNode<Type> head;
    private DLNode<Type> tail;
    private int size;
    
    // cons
    public DLinkedList(){
       // head = tail = null;
       head = new DLNode<>();
       tail = new DLNode<>();
       head.setNext(tail);
       tail.setPrevious(head);
        
    }
    
    // operations
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){return size == 0;}
    
    public DLNode<Type> getHead(){
        return head;
    }
    
    public DLNode<Type> getTail(){
        return tail;
    }
    
    public void addFront(Type ele){
        DLNode<Type> newNode = new DLNode<>(ele);
        newNode.setPrevious(head);
        newNode.setNext(head.getNext());
        
        head.getNext().setPrevious(newNode);
        head.setNext(newNode);
        
        size++;
    }
    
    public void addLast(Type ele){
        DLNode<Type> newNode = new DLNode<>(ele);
        newNode.setNext(tail);
        newNode.setPrevious(tail.getPrevious());    
        
        tail.getPrevious().setNext(newNode);
        tail.setPrevious(newNode);
        
        size++;
    }
    
    // add middle
    public void addAt(Type ele, int index){
        DLNode<Type> newNode = new DLNode<>(ele); // create new node
        if(head == null) {
              head = tail = newNode;
              head.setPrevious(null);
              tail.setNext(null);
        }else {
             DLNode<Type> current = head;
             DLNode<Type> temp = null;  
             
            //Iterate through list till current points to inputted index position  
            for(int i = 0; i < index; i++){  
                current = current.getNext();  
            }  
            if(current == head) { // if index is front
                addFront(ele);
            }else if(current == tail) { // if index is tail
                addLast(ele);
            }else {
                //Node temp is next current
                temp = current.getNext();  
                temp.setPrevious(current); 

                //nadd newNode between current and temp  
                current.setNext(newNode);  
                newNode.setPrevious(current);  
                newNode.setNext(temp);  
                temp.setPrevious(newNode);    
            }
 
        }
        size++; // increment size
    }
        
    
    public  DLNode<Type> removeFront(){
        if(isEmpty())
            return null;
        
        DLNode<Type> removed = head.getNext();
        
        head.setNext(removed.getNext());
        head.getNext().setPrevious(head); // removed.getNext().setPrevious()
        
        /*
        head.setNext(head.getNext().getNext());
        head.getNext().setPrevious(head);
        */
        size--;
        
        return removed;
    }
    
    public  DLNode<Type> removeLast(){
        if(isEmpty())
            return null;
        
        DLNode<Type> removed = tail.getPrevious();
        tail.setPrevious(removed.getPrevious());
        tail.getPrevious().setNext(tail);
        
        /* 
        tail.setPrevious(tail.getPrevious().getPrevious());
        tail.getPrevious().setNext(tail);
        */
        size--;
        
        return removed;
    }
    
    

    public DLNode<Type> removeAt(int index){
        
        // if head is null or index is smaller than 0, return null
        if(head == null || index < 0) {
            return null;
        }else {
            DLNode current = head;
            DLNode<Type> temp = null;  
            // traverse node 
            for(int i = 0; current != null && i <= index; i++) { // traverse: call getNext() "index" times
                current = current.getNext();
            }
            
            // if there is no element in that index
            if (current == null) {
                return null;
            }else if(current == head) { // check if current is head
                return removeFront();
            }else if(current == tail) {// check if current is tail
                return removeLast();
            }else {
                temp = current.getNext();
                current.getPrevious().setNext(temp);
                temp.setPrevious(current.getPrevious());
                
                size--;
                
                return current;
            }   
        }

    }
    
    
    public DLNode<Type> getAt(int index){
    
        if(index >= getSize() || index < 0) { // if index is outbound
            return null;
        }else {
            DLNode current = head;
            for(int i = 0; i <= index; i++) { // traverse: call getNext() "index" times
                current = current.getNext();
            }

            return current;
        }
    
    }
    
}
