/*
Shogo Terashima
B2001046
 */
package StackandQueue;

public class ArrayQueue<Type> implements QueueInterface<Type>{
    
    private Type[] arrayQueue;
    private int f = 0; // index of front element
    private int sz = 0; // current number of elements
    
    // constructor
    public ArrayQueue(int length) {
        arrayQueue = (Type[]) new Object[length];
    }

    public int size() {
        return sz;
    }
    public boolean isEmpty() {
        return sz == 0;
    }
    
    public Type first() {
        if(isEmpty()) {return null;}
        
        return arrayQueue[f];
    }
    
    public void enqueue (Type element) {
        
        if(sz == arrayQueue.length) {
            System.out.println("Error Queue is already full");
        }else {
            int r = (f + sz) % arrayQueue.length;
            arrayQueue[r] = element;
            sz++;
        }

    }
    public Type dequeue() {
        
        if(isEmpty()){return null;}
        else {
            Type removed = arrayQueue[f];
            arrayQueue[f] = null;
            f = (f+1) % arrayQueue.length;
            sz--;
        
            return removed;
            
        }

    }
    
    
}
