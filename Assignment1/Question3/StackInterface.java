/*
Shogo Terashima
B2001046
 */
package Question3;

public interface StackInterface <Type> {
    
    public int size ();
    
    public boolean isEmpty ();
    
    public Type top ();
    
    public Type pop ();

    public void push (Type element); 


}
