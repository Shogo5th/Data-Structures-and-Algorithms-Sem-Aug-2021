/*
Shogo Terashima
B2001046
 */

package StackandQueue;

public class ArrayDriver {
    
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>(2);
        System.out.println(stack.size());
        stack.push("a");
        stack.push("a");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("a");
        stack.push("a");        

        
    }
    
}
