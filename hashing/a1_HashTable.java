package hashing;

/**
 *
 * @Sir Darey
 */
public class a1_HashTable {
   
    private final HashNode [] buckets;
    private final int numOfBuckets;
    private int size;
    
    public a1_HashTable (int capacity) {
        buckets = new HashNode[capacity];
        numOfBuckets = capacity;
    }
    
    private static class HashNode {
        private Integer key;
        private String value;
        private HashNode next;
        
        public HashNode (Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
   
    private int getBucketIndex (int key) {
        return key % numOfBuckets;
    }
    
    public void put (Integer key, String value) {
        if (key == null ||  value == null)
            throw new IllegalArgumentException("Invalid Key or Value Pair Argument");
        
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;    
        }
        
        size++;
        head = buckets[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode;
    }
    
    public String get (Integer key) {
        
        if (key == null)
            throw new IllegalArgumentException("Invalid Key");
        
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key))
                return "Key:"+ key + " Value: " +head.value;
            
            head = head.next;
        }
        return "Key:"+ key + " Not Found!!!";
    }
    
    public String remove (Integer key) {
        if (key == null)
            throw new IllegalArgumentException("Invalid Key");
        
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];        
        HashNode previous = null;
        
        while (head != null) {
            if (head.key.equals(key))
                break;
            
            previous = head;
            head = head.next;
        }
        
        if (head == null) 
            return "Key:"+ key + " Not Found!!!";
        
        size--;
        if (previous != null) 
            previous.next = head.next;
        else 
            buckets[bucketIndex] = head.next;
            
        return "Key:"+ key + " Deleted "+head.value+ " Successfully";
    }
    
    public static void main(String[] args) {
        a1_HashTable table = new a1_HashTable(10);
        
        table.put(5, "John Bull");
        table.put(1, "Segun");
        table.put(21, "Mary");
        table.put (1, "Peter");
        
        System.out.println("Number of Key-Value Pair: " +table.size +"\n");
        
        System.out.println(table.get(1));
        System.out.println(table.get(5));
        System.out.println(table.get(21));
        System.out.println(table.get(6));
        
        System.out.println("");
        
        System.out.println(table.remove(1));
        System.out.println(table.remove(1));
        System.out.println(table.remove(5));
        
        System.out.println("");
        
        System.out.println("Number of Key-Value Pair: " +table.size);
        
    }
}
