/*
Shogo Terashima
B2001046
 */

package StackandQueue;

public class ArrayStack<Type> implements StackInterface <Type>  {
    
    private int top;
    private Type[] stackArray;
    private int size;
    
    // constructor
    ArrayStack(int size) {
        stackArray = (Type[]) new Object[size];
        top = -1;
        this.size = size;
    }
    
    public int size () {
        return size;
    }
    public boolean isEmpty () {
        return top == -1;
    }
            
    public Type top () {
        if(isEmpty()){ return null;}
        
        return stackArray[top];
    }
    
    public Type pop () {
        
        // check if stack is empty
        if (isEmpty()){return null;} 
         
        Type poppedElement = stackArray[top];
        //stackArray[top] = null; // delete
        top--;
        
        return poppedElement;
    }
    
    public void push (Type element) {
        // check if stack is full
        if(top == size()-1) {
            System.out.println("Error Stack is full. Can not push");
        }else {
            top++;
            stackArray[top] = element;    
        }

    }
    
}
