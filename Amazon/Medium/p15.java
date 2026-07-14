//LRU Cache(LC 146)
//Optimal Approach----T.C:O(1)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;
class p15{
    class Node{
        Node prev,next;
        int key,value;
        Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }

    Node head=new Node(0,0),tail=new Node(0,0);
    Map<Integer,Node> mp=new HashMap();
    int capacity;
    public p15(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key))
        {
            Node node=mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key))
        remove(mp.get(key));
        if(mp.size()==capacity)
        remove(tail.prev);

        insert(new Node(key,value));
    }

    void remove(Node node)
    {
        mp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    void insert(Node node)
    {
        mp.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        headNext.prev=node;
        node.next=headNext;
    }
}

/**
 * Your p15 object will be instantiated and called as such:
 * p15 obj = new p15(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */