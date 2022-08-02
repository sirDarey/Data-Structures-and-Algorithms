package binaryTree;

/**
 *
 * @Sir Darey
 */
public class c1_CreateMaxHeap {
    
    private Integer [] heap;
    private int n; // size of max heap
    
    public c1_CreateMaxHeap (int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }
    
    boolean isEmpty() {
        return n==0;
    }
    
    int size () {
        return n;
    }
    
    void resize (int newSize) {
        Integer[] newHeap = new Integer[newSize];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }
    
    void insert (int x) {
        if (n == heap.length-1) 
            resize (2*heap.length);
        
        n++;
        heap[n] = x;
        swim (n);
    }
    
    void swim (int k) {
        while (k > 1 && heap[k/2] < heap[k]) {
            int temp = heap [k];
            heap [k] = heap[k/2];
            heap [k/2] = temp;
            k = k/2;
        }
        
    }  
    
    void display() {
        for (int i=1; i<=n; i++) {
            System.out.print(heap[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        c1_CreateMaxHeap maxHeap = new c1_CreateMaxHeap(3);
        
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(9);
        maxHeap.insert(1);
        
        System.out.println("Size of Heap: "+maxHeap.size());
        maxHeap.display();
    }
}
