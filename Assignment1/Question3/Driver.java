/*
Shogo Terashima
B2001046
 */

package Question3;
import java.util.Scanner;

public class Driver {
    
    // check if character is alphabet or number to ignore space and punctuation 
    // I don't mention about lowercase because str will be changed to uppercase
    private static boolean isAlphabetOrNumber(char element) {
        return (element >= 'A' && element <= 'Z') || (element >= '0' && element <= '9');
    }
    
    
    public static void main (String[] args) {
        LinkedStack <Character> linkedStack = new LinkedStack<Character> () ;
        LinkedQueue <Character> linkedQueue = new LinkedQueue<Character> () ;
        
        
        boolean flag = true; // flag for loop
        Scanner stdIn = new Scanner(System.in);

        
       
        int count = 0;
        
        while(true){
            System.out.println("Enter string or press q to exit");
            String str = stdIn.nextLine();
            
            if(str.charAt(0) == 'q') {
                System.exit(0);
            }else {
                
                 // chage characters to upper case
                 str = str.toUpperCase();

                for (char temp: str.toCharArray()) {
            
                // spaces and punctuation
                if(isAlphabetOrNumber(temp)){

                    linkedStack.push(temp);
                    linkedQueue.enqueue(temp);

                    count ++ ;
                }
            
            
                }
        
                for (int i = 0 ; i < count ; i++) {
           
                    if(linkedStack.pop() != linkedQueue.dequeue()){
                        System.out.println ("is not a palindrome");
                        flag = false; // change flag not to execute "is a palindrome"
                        break;
                    }
                }
        
                if (flag) { System.out.println ("is a palindrome");}

            }       
        }
    }   
}
