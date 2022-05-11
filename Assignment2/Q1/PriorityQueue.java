/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q1;

public class PriorityQueue {
    private Customer[] heap; // customer object
    private int lastIndex;
    
    PriorityQueue(Integer size){
        this.heap = new Customer[size];
        this.lastIndex = 0;
    }
    
    // enqueue put new cutomer
    void enqueue(Customer data) {
        if(lastIndex + 1 > heap.length -1 ) {
            Customer[] temp = heap;
            heap = new Customer[temp.length * 2];
            
            for(int i = 0; i < temp.length; i++) {
                heap[i] = temp[i];
            }
        }
        
        lastIndex++;
        heap[lastIndex] = data;
        shiftUp();
    }
    
    // dequeue
    Customer dequeue() {
        if(lastIndex <= 0) {
            return null;
        }
        Customer rootValue = heap[1];
        swap(1, lastIndex);
        lastIndex--;
        shiftDown();
        
        return rootValue;
    }
    
    // move up
     // When the value of the parent node is smaller, replace it → Configure the value of the root node to be the maximum value
    private void shiftUp() {
        int index = lastIndex;
        int parentIndex = parent(index);
        while(parentIndex > 0 && heap[index].getPriority() > heap[parentIndex].getPriority()) {
            swap(index, parentIndex); // swap priority higher loop
            index = parentIndex;
            parentIndex = parent(parentIndex);
        }
    }
    
    // move down
    private void shiftDown() {
        int index = 1;
        
        while(index < lastIndex) { 
            int maxValue = heap[index].getPriority();
            int maxIndex = index;
            int leftIndex = left(index);
            if (leftIndex > 0 && maxValue < heap[leftIndex].getPriority()) { // compare priority
                maxValue = heap[leftIndex].getPriority();
                maxIndex = leftIndex;
            }
            
            int rightIndex = right(index);
            if(rightIndex > 0 && maxValue < heap[rightIndex].getPriority()) {
                maxValue = heap[rightIndex].getPriority();  // update max value
                maxIndex = rightIndex;
            }
            
            if(maxIndex == index) {
                break;
            }
            swap(maxIndex, index);
            index = maxIndex;
        }
    }
    
    // check left child
    private int left(int index) {
        int leftChild = index * 2;
        return leftChild <= lastIndex ? leftChild : 0; 
    }
    
    // check right child
    private int right(int index) {
        int rightChild = index * 2 + 1;
        return rightChild <= lastIndex ? rightChild : 0;
    }
    
    // show parent 
    private int parent(int index) {
        if(index <= 1) {
            return 0;
        }
        return index / 2;
    }
    
    // swap method
    private void swap(int index1, int index2) {
        Customer temp = heap[index1]; 
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}
