
package DLL;


public class DLNode<Type> {
    
    private DLNode<Type> next;
    private DLNode<Type> prev;
    private Type element;
       
    
    public DLNode(){
        next = prev = null;
    }
    
    public DLNode( Type ele){
        element = ele;
    }
    
    public void setElement(Type ele){
        element = ele;
    }
    public Type getElement(){
        
        return element;
    }
    
    public void setPrevious( DLNode<Type> prev){
        this.prev = prev;
    }
    
    public DLNode<Type> getPrevious(){
        return prev;
    }
    
    public void setNext( DLNode<Type> next){
        this.next = next;
    }
    
    public DLNode<Type> getNext(){
        return next;
    }
    
}
