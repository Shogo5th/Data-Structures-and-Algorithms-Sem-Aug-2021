/*
Shogo Terashima
B2001046
 */

package Question1;


public class Node<Type> 
{
	// Instance variables:
	private Type element;
	private Node< Type > next;

	/** 
	 * Creates a node with the given element and next node.
	 */
	public Node(Type e, Node< Type > n) 
	{
		element = e;
		next = n;
	}
	
	/** 
	 * Create a node with the given element, with next node
    * sets to null
	 */
	public Node(Type e)
	{
		this(e, null);
	}
	
	/** 
	 * Creates a node with null references to its element 
	 * and next node. 
	 */
	public Node()
	{
		this(null, null);
	}
	
	// Accessor methods:
	public Type getElement() 
	{
		return element; 
	}
	
	public Node< Type > getNext() 
	{ 
		return next;
	}
	
	// Modifier methods:
	public void setElement(Type newElem) 
	{ 
		element = newElem; 
	}
	
	public void setNext(Node< Type > newNext) 
	{
		next = newNext; 
	}
        
        
}
