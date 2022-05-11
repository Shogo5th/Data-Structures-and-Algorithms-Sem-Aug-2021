/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q3;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        
        // initialize array
        int[] order_array = new int[1010]; // allocate bigger space
        int[] random_array = new int[1010];
        
        
        Random random = new Random();
        // prepare order array and random array
        for(int i = 0 ; i <= 1000; i++) {
           order_array[i] = i;
           random_array[i] = random.nextInt(1001); // random integers between 0 and 1000
        }
        
        /*
        // insertion sort running time (order)
        long order_insertSort_start = System.nanoTime();
        MergeSort.mergeSort(order_array,1000);
        long order_insertSort_end = System.nanoTime();
        long order_insertSort_time =order_insertSort_end - order_insertSort_start;
        
        // insertion sort running time (order)
        long random_insertSort_start = System.nanoTime();
        MergeSort.mergeSort(random_array,1000);
        long random_insertSort_end = System.nanoTime();
        long random_insertSort_time = random_insertSort_end - random_insertSort_start;
        
        System.out.println("merge sort order: " + order_insertSort_time + " microseconds");
        System.out.println("merge sort random: " + random_insertSort_time + " microseconds");
        */
        
        
        // insertion sort running time
        long insertSort_start = System.nanoTime();
        InsertionSort.insertionSort(random_array,1000);
        long insertSort_end = System.nanoTime();
        long insertSort_time = insertSort_end - insertSort_start ;
        
        // quick sort running time
        long quickSort_start = System.nanoTime();
        QuickSort.quickSort(random_array,0,1000);
        long quickSort_end = System.nanoTime();
        long quickSort_time = quickSort_end - quickSort_start;
        
        // merge sort running time
        long mergeSort_start = System.nanoTime();
        MergeSort.mergeSort(random_array,1000);
        long mergeSort_end = System.nanoTime();
        long mergeSort_time = mergeSort_end - mergeSort_start;


        // results
        System.out.println("Insertion Sort" + insertSort_time/1000 + "microseconds");
        System.out.println("Quick Sort" + quickSort_time/1000 + "microseconds");
        System.out.println("Merge Sort" + mergeSort_time/1000+ "microseconds");

        
    }


}
