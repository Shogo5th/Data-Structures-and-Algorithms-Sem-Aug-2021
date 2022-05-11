/*
Shogo Terashima
B2001046
 */

package StackandQueue;
import java.util.Scanner;

public class Driver {
    
    // check if character is alphabet or number to ignore space and punctuation 
    // I don't mention about lowercase because str will be changed to uppercase
    private static boolean isAlphabetOrNumber(char element) {
        return (element >= 'A' && element <= 'Z') || (element >= '0' && element <= '9');
    }
    
    public static void displayInSeries(SLinkedList<Integer> list) {
        Node temp = list.getHead();
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>(); 
        int element = 0; 
        int first = 0;
        int last = 0;
        System.out.println("First Line:");
        while(temp != null) {
            
            // this is for first line
            element = (int)temp.getElement();
            last = element % 10; // last digit
            first = (element / 10) % 10; // first difit
            if( (first + last) % 3 == 0){
                System.out.print(temp.getElement() + " "); // first line
            }else {
                // this is for second line
                // enqueue to the list
                queue.enqueue(element);
            }
            temp = temp.getNext();// get next
        }

        // show second line
        System.out.println("\nSecond Series:");
        Integer temp2 = queue.dequeue();
        while(temp2 != null){
            System.out.print(temp2 + " ");
            temp2 = queue.dequeue(); // deququq while not null
        }
    }
    
    public static void main (String[] args) {
        //LinkedStack <Character> linkedStack = new LinkedStack<Character> () ;
        LinkedQueue <Integer> linkedQueue = new LinkedQueue<Integer> () ;
        SLinkedList<Integer> list = new SLinkedList<Integer>();
        
        list.addLast(12);
        list.addFront(11);
        list.addLast(32);
        list.addLast(125);
        list.addFront(331);
        list.addLast(215);
        list.addLast(312);
        list.addFront(39);
        list.addFront(4);
        list.addLast(7);
        
        displayInSeries(list);

       
    }   
}
