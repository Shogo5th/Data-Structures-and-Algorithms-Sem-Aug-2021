/*
Shogo Terashima
B2001046
 */
package Question3;

public interface QueueInterface <Type> {
    public int size();
    public boolean isEmpty();
    public Type first();
    public void enqueue (Type element);
    public Type dequeue();
}
