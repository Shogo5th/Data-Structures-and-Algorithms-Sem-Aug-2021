/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q3;

public class InsertionSort {
    static void insertionSort(int[] array, int n){
        for(int i = 1; i <= n; i++) {
            int j;
            int temp = array[i];
            
            // traverse ito 0
            for(j = i; j > 0 && array[j-1] > temp; j--) {
                array[j] = array[j-1]; // if there is a element equeal or less than temp
            }
            array[j] = temp;
        }
    }
    
}
