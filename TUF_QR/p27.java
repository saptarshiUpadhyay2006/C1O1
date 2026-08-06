package TUF_QR;
import java.util.*;
class Node{
    public int key,val;
    public Node next,prev;
    Node()
    {
        key=val=-1;
        next=prev=null;
    }
    Node(int k,int value)
    {
        key=k;
        val=value;
        next=prev=null;
    }
}

class LRUCache {
    private Map<Integer,Node> mp;
    private int cap;
    private Node head;
    private Node tail;
    private void deleteNode(Node node)
    {
        Node prevNode=node.prev;
        Node nextNode=node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
    private void insertAfterHead(Node node)
    {
        Node nextNode=head.next;
        head.next=node;
        nextNode.prev=node;
        node.prev=head;
        node.next=nextNode;
    }
    public LRUCache(int capacity) {
       cap=capacity;
       mp=new HashMap<>();
       head=new Node();
       tail=new Node();
       head.next=tail;
       tail.prev=head;
    }

    public int get(int key_) {
       if(!mp.containsKey(key_))
       return -1;

       Node node=mp.get(key_);
       int val=node.val;
       deleteNode(node);
       insertAfterHead(node);
       return val;
    }

    public void put(int key_, int value) {
      if(mp.containsKey(key_))
      {
        Node node=mp.get(key_);
        node.val=value;
        deleteNode(node);
        insertAfterHead(node);
        return;
      }
      if(mp.size()==cap)
      {
        Node node=tail.prev;
        mp.remove(node.key);
        deleteNode(node);
      }
      Node newNode=new Node(key_,value);
      mp.put(key_,newNode);
      insertAfterHead(newNode);
    }

}