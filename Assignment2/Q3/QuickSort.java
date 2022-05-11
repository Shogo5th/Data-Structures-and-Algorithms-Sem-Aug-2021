/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q3;

public class QuickSort {
    
    static void quickSort(int[] array, int left, int right) {
        int sl = left; // left side
        int sr = right; // right side
        int center = array[(sl + sr) / 2]; // calculate center
        
        do {
            while(array[sl] < center) sl++; // traverse to the right until  array[sl] < center
            while(array[sr] > center) sr--;// traverse to the left until  array[sr] > center
            if(sl <= sr) {
               swap(array,sl++, sr--); // swap for when sl 
            }
        }while(sl <= sr);
        
        if(left < sr) quickSort(array,left,sr);
        if(sl < right) quickSort(array,sl,right);
    }
    // swap function
    static void swap(int[] a, int index1, int index2) {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }
    
}
