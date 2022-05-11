/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BSTDriver {
     public static void main(String[] args) throws IOException{
        

        BST bst = new BST(); // instntiate BST object
        
        // initialize varialbes
        Scanner stdIn = new Scanner(System.in);
        int n;
        int id;
        String name;
        double cgpa;
        
        while(true) {
            System.out.println("1: Add new student");
            System.out.println("2: Remove student");
            System.out.println("3: Read file");
            System.out.println("4: Show all");
            System.out.println("5: Search student");
            System.out.println("6: quit");
            System.out.println("Enter your option");
            
            n = stdIn.nextInt();
            
            switch(n) {
                case 1:
                    System.out.println("Enter student id");
                    id = stdIn.nextInt();
                    System.out.println("Enter first name");
                    name = stdIn.next();
                    System.out.println("Enter cgpa");
                    cgpa = stdIn.nextDouble();
                    bst.add(id, name + " "+ cgpa);
                    break;
                case 2:
                    System.out.println("Enter student id");
                    id = stdIn.nextInt();
                    System.out.println("removed");
                    break;
                case 3:
                    addFile(bst);
                    break;
                case 4:
                    bst.print();
                    break;
                case 5:
                     System.out.println("Enter student id");
                     id = stdIn.nextInt();
                     String student = bst.search(id);
                     if(student == null) {System.out.println("note found");}
                     else{System.out.println(id + " " + student);}
                     break;
                case 6:
                    System.out.println("Quit Programm...");
                    System.exit(0);
                default:
                    System.out.println("Pleae enter correct option");
                    break;

            }
            
        }

    }
     
     public static void addFile(BST bst) throws FileNotFoundException, IOException {
         //String path = "C:\\Users\\17105\\Documents\\NetBeansProjects\\Assignment2\\src\\Q2\\records.txt"; // the path to waitlist.txt
         Scanner stdIn = new Scanner(System.in);
         System.out.println("Enter file path");
         String path = stdIn.next();
         FileReader fr = new FileReader(path);
         BufferedReader br = new BufferedReader(fr);	
         String line; 
         line = br.readLine();	
         while( line != null ){
             String[] theLine = line.split(" ");
             bst.add(Integer.parseInt(theLine[0]),theLine[1] + " " +theLine[2]);
             line = br.readLine();
         }
         br.close();
     }
}
