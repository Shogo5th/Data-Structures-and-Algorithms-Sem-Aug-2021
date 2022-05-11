
package SLL;
import java.util.Scanner;

public class LinkedListDriver {
    
    public static void main(String[] args){
        
       SLinkedList<String> sll = new SLinkedList<String>();
       String element;
       int at;
       String enter;
       
       Node temp = sll.getHead();
       
       // TODO : create  a menu for various SLL operations
       Scanner stdIn = new Scanner(System.in);
       
       while(true){
           System.out.println("Choose option\n");
           System.out.println("1: Add Front");
           System.out.println("2: Add Last");
           System.out.println("3: Add At");
           System.out.println("4: Remove First");
           System.out.println("5: Remove Last");
           System.out.println("6. Remove At");
           System.out.println("7: Show list");
           System.out.println("8: Quit");
           
           
           System.out.println("\noption ?");
           int option = stdIn.nextInt();
           
           switch(option){
               
               case 1:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   sll.addFront(element);
                   
                   break;
                   
               case 2:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   sll.addLast(element);
                   
                   break;
                   
               case 3:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   System.out.println("Enter element");
                   element = stdIn.next();
                   sll.addAt(element,at);
                   
                   
                   break;
               case 4:
                   element = sll.removeFirst();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 5:
                   element = sll.removeLast();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 6:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   element = sll.removeAt(at);
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 7:
                   System.out.println("\nlist size is:" + sll.size());
                   temp = sll.getHead();
                   int count = 0;
                   while(temp!=null){
                        System.out.println("index" + count + " : " + temp.getElement());
                        temp = temp.getNext();
                        count++;
                    }
                   
                   break;
                   
               case 8:
                   System.out.println("Quit programm....");
                   System.exit(0);
               default:
                   System.out.println("Enter 1 to 8");
                   
                   break;
           
                }
           
       }

        
    }
    
}
