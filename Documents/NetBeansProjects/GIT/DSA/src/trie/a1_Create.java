package trie;

/**
 *
 * @Sir Darey
 */
public class a1_Create {
    
    private TrieNode root;
    
    public  a1_Create () {
        this.root = new TrieNode();
    }
    
    private static class TrieNode {
        private TrieNode [] children;
        private boolean isWord;
        
        public TrieNode () {
            this.children = new TrieNode[26]; //same capacity as the number of English Alphabets
            this.isWord = false;
        }
    }
    
    public void insert (String word) {
        
        if (word.isEmpty() || word==null)
            throw new IllegalArgumentException("Invalid Argument");
        
        word = word.toLowerCase();
        TrieNode current = root;
        
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            
            if (current.children[index] == null) {
                TrieNode newNode = new TrieNode ();
                current.children[index] = newNode;
                current = newNode;
            } else 
                current = current.children[index];
        }
        
        current.isWord = true;
    }
    
    public static void main(String[] args) {
        a1_Create newWord = new a1_Create();
        
        newWord.insert("Good");
        newWord.insert("Boy");
        
        System.out.println("Words inserted successfully");
    }
}
