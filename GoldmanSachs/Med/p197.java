//Implement Trie(Prefix Tree)(LC 208)
//Initialise TrieNode & do such

package GoldmanSachs.Med;

class TrieNode{
    public char val;
    public boolean isWord;
    public TrieNode children[]=new TrieNode[26];

    public TrieNode(){}
    TrieNode(char ch)
    {
        TrieNode node=new TrieNode();
        node.val=ch;
    }
}

class Trie {
    private TrieNode root;
    public Trie() {
        root=new TrieNode();
        root.val=' ';
    }
    
    public void insert(String word) {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ws.children[ch-'a']==null)
            ws.children[ch-'a']=new TrieNode(ch);

            ws=ws.children[ch-'a'];
        }
        ws.isWord=true;
    }
    
    public boolean search(String word) {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ws.children[ch-'a']==null)
            return false;

            ws=ws.children[ch-'a'];
        }
        return ws.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ws=root;
        for(int i=0;i<prefix.length();i++)
        {
            char ch=prefix.charAt(i);
            if(ws.children[ch-'a']==null)
            return false;

            ws=ws.children[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
