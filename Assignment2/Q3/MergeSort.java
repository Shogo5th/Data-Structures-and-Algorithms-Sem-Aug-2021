/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q3;

public class MergeSort {
    
    static int[] buff; // array for using mergesort
    
    
    // merge sort for left and right
    static void r_mergeSort(int[] array, int left, int right) {
        
        if(left < right) { 
            int i;
            int center = (left + right) / 2;
            int a = 0;
            int b = 0;
            int c = left;

            r_mergeSort(array, left, center); // merge   left siede recursively
            r_mergeSort(array, center+1, right);// meerge right side recursively

            // Copy the first half of the array to  from bff[0] to bff[center -left]
            for(i = left; i <= center; i++) {
                buff[a++] = array[i];
            }

            // The second half of the array and the first half of the array copied to buff will be merged and the result will be stored in "array"
            while(i <= right && b < a) {
                array[c++] = (buff[b] <= array[i]) ? buff[b++] : array[i++];
            } 
            //Copy the remaining unstored elements of the array buff to the "array"
            while(b < a) {
                array[c++] = buff[b++];
            }
            
        }

    }
    
    static void mergeSort(int[] array, int n) {
        buff = new int[n];
        r_mergeSort(array,0,n); // merge sort whole part 
        buff = null; // reset buff
    }
}
