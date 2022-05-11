/*
Student name: Shogo Terashima
Student ID: B2001046
 */

package Q1;
import java.util.*;
import java.io.*;

public class FlightBooked {
     public static void main (String args[]) throws FileNotFoundException, IOException {
         
         
         
         Customer[] cutomers; // array for put cutomer;
         Scanner stdIn = new Scanner(System.in); // scanner
         
         // read file and count number of rows
         int lineCount = 0;
         String path;
         System.out.println("Enter file path"); 
         path = stdIn.next();// the path to waitlist.txt

         FileReader fr = new FileReader(path);
         BufferedReader br = new BufferedReader(fr);
         String line; 
         line = br.readLine();		
         while( line != null ){
             lineCount++;   
             line = br.readLine();
         }
         br.close();

        
         // create customer array   
         // read file again
         Customer[] customers = new Customer[lineCount];
         FileReader fr2 = new FileReader(path);
         BufferedReader br2 = new BufferedReader(fr2);	
         line = br2.readLine();	
         
         // read line one by one
         int count = 0;
         while( line != null ){
             boolean overidden = false;
             String[] theLine = line.split(",");
             String name = theLine[0];
             int mileage = Integer.parseInt(theLine[1]);
             int year = Integer.parseInt(theLine[2]);
             int sequence = Integer.parseInt(theLine[3]);
             
             // calculate priority
             int priority = (mileage / 1000) + year - sequence;
             Customer cust = new Customer(name,mileage,year);
             cust.setPriority(priority);
             
             // check if the customer's name and override
             for(int i = 0; i < count ; i++) {
                 if(cust.equals(customers[i])) {
                     customers[i] = cust;
                     overidden = true;
                 }
             }
             // if not override, add  new element of array
             if(!overidden) {
                 customers[count] = cust;
                 count++;
             }

             line = br2.readLine();
         }
         
         br2.close(); // close 
         
         // traverse and enqueue
         PriorityQueue pq = new PriorityQueue(10);
         for(int i=0 ; i < count ; i++) {
             pq.enqueue(customers[i]);
         }
         
         // dequeue and display
         for(int i=0 ; i < count ; i++) {
             Customer theCustomer = pq.dequeue();
             System.out.println(theCustomer.getPriority() + " -> " + theCustomer.toString());
         }
 
        
  }  
}
