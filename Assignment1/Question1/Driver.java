/*
Shogo Terashima
B2001046
 */

package Question1;

import Question1.Node;
import Question1.SLinkedList;
import java.util.Scanner;

public class Driver {
    
    public static long add(long num1, long num2) {
        
        long dig1 = 0;
        long dig2 = 0;
        
        long result = 0;
        long i = 1; // * 10 in each step
        int count = 0;
        
        // addition
        while(num1 != 0 || num2 != 0){

          dig1 = num1 % 10; // get digits
          dig2 = num2 % 10;
          
          result = result +  (dig1 + dig2) * i;
         
          num1 = num1 / 10;
          num2 = num2 / 10;
          i *= 10;
          
          
        }
        
        return result;
    }
    
    
    public static SLinkedList<Long> concatList (SLinkedList<Long> list1,SLinkedList<Long> list2){
        
        SLinkedList<Long> c = new SLinkedList<Long>();
        
        Node temp1 = list1.getHead();
        Node temp2 = list2.getHead();
        
        // traverse list1 and addLast to c
        while(temp1!=null){
            c.addLast(Long.parseLong(temp1.getElement().toString()));
            temp1 = temp1.getNext();
        }
        // traverse list2 and addLast to c
        while(temp2!=null){
            c.addLast(Long.parseLong(temp2.getElement().toString()));
            temp2 = temp2.getNext();
        }

        return c;
        
    }
    
    
    public static void main(String[] args){
        
       SLinkedList<Long> list1 = new SLinkedList<Long>();
       SLinkedList<Long> list2 = new SLinkedList<Long>();

       String element;
       int at;
       int count = 0;
       boolean flag = true;
       
       
       
       
      
       Scanner stdIn = new Scanner(System.in);
     
       
       while(true){
           
           if(flag){
               Node temp = list1.getHead();
               System.out.println("Currently editing: N1\n\n");
               System.out.println("Choose option\n");
               System.out.println("1: Add Front");
               System.out.println("2: Add Last");
               System.out.println("3: Add At");
               System.out.println("4: Remove First");
               System.out.println("5: Remove Last");
               System.out.println("6. Remove At");
               System.out.println("7: Show list");
               System.out.println("8: Create N2");
               System.out.println("9: Quit Program");
               
               System.out.println("\noption ?");
               int option = stdIn.nextInt();
               
               switch(option){
               
               case 1:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addFront(Long.parseLong(element));
                   
                   break;
                   
               case 2:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addLast(Long.parseLong(element));
                   
                   break;
                   
               case 3:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addAt(Long.parseLong(element),at);
                   
                   
                   break;
               case 4:
                   element = list1.removeFirst().toString();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 5:
                   element = list1.removeLast().toString();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 6:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   element = list1.removeAt(at).toString();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 7:
                   System.out.println("\nlist size is:" + list1.getSize());
                   temp = list1.getHead();
                   count = 0;
                   while(temp!=null){
                        System.out.println("index" + count + " : " + temp.getElement());
                        temp = temp.getNext();
                        count++;
                    }
                   
                   break;
               
                   
                case 8:
                   System.out.println("Create New List");
                   
                   
                   flag = false;
                   break;
                   
                case 9:
                   System.out.println("Quit programm....");
                   System.exit(0);
                   
                default:
                   System.out.println("Enter 1 to 8");
                   
                   break;
           
                }

           }
           else {
               
               Node temp = list2.getHead();
               Node temp1 = list1.getHead();
               System.out.println("Currently editing:N2 \n\n");
               System.out.println("Choose option\n");
               System.out.println("1: Add Front");
               System.out.println("2: Add Last");
               System.out.println("3: Add At");
               System.out.println("4: Remove First");
               System.out.println("5: Remove Last");
               System.out.println("6. Remove At");
               System.out.println("7: Show list");
               System.out.println("8: Sum");
               System.out.println("9: concatinate");
               System.out.println("10: Exit program");
               
               System.out.println("\noption ?");
               int option = stdIn.nextInt();
               
               switch(option){
               
               case 1:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addFront(Long.parseLong(element));
                   
                   break;
                   
               case 2:
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addLast(Long.parseLong(element));
                   
                   break;
                   
               case 3:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   System.out.println("Enter element");
                   element = stdIn.next();
                   list1.addAt(Long.parseLong(element),at);
                   
                   
                   break;
               case 4:
                   element = list1.removeFirst().toString();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 5:
                   element = list1.removeLast().toString();
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 6:
                   System.out.println("Enter index number");
                   at = stdIn.nextInt();
                   element = list1.removeAt(at).toString();
                   
               
                   System.out.println("Removed: " + element);
                   
                   break;
               
               case 7:
                   System.out.println("\nlist size is:" + list1.getSize());
                   temp = list1.getHead();
                   count = 0;
                   while(temp!=null){
                        System.out.println("index" + count + " : " + temp.getElement());
                        temp = temp.getNext();
                        count++;
                    }
                   
                   break;
               
                   
                case 8:
                  System.out.println("Addition");
                  temp1 = list1.getHead();
                  temp = list2.getHead();
                  
                  count = 0;
                  while(temp1!=null && temp != null){
                      
                        long num1 = Long.parseLong(temp1.getElement().toString());
                        long num2 = Long.parseLong(temp.getElement().toString()); // change to long
                        
                        System.out.println("list 1 Element" + count + " : " + num1);
                        System.out.println("list 2 Element" + count + " : " + num2);
                        System.out.println("The sum is : " + add(num1 , num2));
                        
                        temp1 = temp.getNext(); // get next
                        temp = temp.getNext(); // get next
                        count++;
                   }
                   
                   break;
                
                 case 9:
                   System.out.println("concatinate list");
                   SLinkedList<Long> c = new SLinkedList<>();
                   c = concatList(list1 , list2);
                   
                   System.out.println("\nlist size is:" + c.getSize());
                   Node tempc = c.getHead();
                   count = 0;
                   while(tempc!=null){
                        System.out.println("index" + count + " : " + tempc.getElement());
                        tempc = tempc.getNext();
                        count++;
                   }
                 
                break;
                case 10:
                   System.out.println("Quit programm....");
                   System.exit(0);
                   
                default:
                   System.out.println("Enter 1 to 10");
                   
                   break;
           
                }
           }

           
           
           
           

           
       }

    }
   
}
