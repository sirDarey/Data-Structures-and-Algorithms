package binaryTree;

/**
 *
 * @Sir Darey
 */
public class c2_DeleteMaxElementMaxHeap {
    
    private Integer [] heap;
    private int n;
    
    boolean isEmpty() {
        return n==0;
    }
    
    int size () {
        return n;
    }
    
    public c2_DeleteMaxElementMaxHeap (int capacity) {
        heap = new Integer [capacity+1];
        n = 0;
    }
    
    void resize (int newSize) {
        Integer [] newHeap = new Integer [newSize];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }
    
    void  insert (int data) {
        if (n==heap.length-1)
            resize (2*heap.length);
        
        n++;
        heap[n] = data;      
        swim (n);
    }
    
    void swim (int k) {
        while (k>1 && heap[k/2] < heap [k]) {
            int temp = heap[k];
            heap[k] = heap [k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }
    
    void display() {
        for (int i=1; i<=n; i++) {
            System.out.print(heap[i] + " ");
        }
    }
    
    void  swap (int a, int b) {
        int temp = heap [a];
        heap[a] = heap [b];
        heap[b] = temp;
    }
    
    void sink (int k) {
        while (k*2 <= n) {
            int j = k*2;
            if (j<n && heap[j] < heap[j+1])
                j++;
            if (heap[k] >= heap[j])
                break;
            
            swap (k, j);
            k = j;
        }
    }
    
    void deleteMax () {
        int max = heap[1];
        
        swap (1, n);
        n--;
        
        sink (1);
        heap [n+1] = null;
        
        if (n>0 && n == (heap.length-1)/4) 
            resize(heap.length/2);
        
        System.out.println("\nDeleted the Max Value of the Max Heap with data: "+max);
    }
    
    public static void main(String[] args) {
        c2_DeleteMaxElementMaxHeap maxHeap = new c2_DeleteMaxElementMaxHeap(6);
        
        maxHeap.insert(10);
        maxHeap.insert(9);
        maxHeap.insert(8);
        maxHeap.insert(7);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.insert(4);
        
        
        System.out.println("Size of Heap: "+maxHeap.size());
        maxHeap.display();
        
        maxHeap.deleteMax();
        maxHeap.display();
    }
    
}
