
package DLL;
// import java.util.Scanner;

public class DLLDriver {
    
    public static void main(String[] args){
        DLinkedList<String> dll= new DLinkedList<String>();
        dll.removeFront();
        dll.addFront("first");
        dll.addLast("One");
        dll.addLast("Two");
        dll.addLast("Three");
        dll.addLast("last");
        //System.out.println("removed" + dll.removeFront().getElement());
        //System.out.println("removed" + dll.removeLast().getElement());
        //dll.addAt("index",3);
        //System.out.println("remove" + dll.removeAt(0).getElement());
        System.out.println(dll.getSize());
        DLNode temp = dll.getHead();
        
        
        
        /* CAN NOT USE GETELEMENT() IF THE NODE IS NULL !!!!!! <= try this form
        DLNode a = dll.getAt(10);
        if(a != null) {
            System.out.println("at" + a.getElement());
        }else {
             System.out.println("at" + a);
        }
        */
        
        //System.out.println("At" + dll.getAt(4).getElement());
       while(temp.getNext()!= dll.getTail()){
           temp = temp.getNext();
           System.out.println(temp.getElement());
       }
        
      
    }
    
}
