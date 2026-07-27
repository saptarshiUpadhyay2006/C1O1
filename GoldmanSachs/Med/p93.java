//Design Circular Deque(LC 641)
//Implementation from scratch

package GoldmanSachs.Med;

class MyCircularDeque {
    int re,fr,sz,cap;
    int deque[];
    public MyCircularDeque(int k) {
        deque=new int[k];
        fr=0;
        re=-1;
        sz=0;
        cap=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull())
        return false;

        fr=(fr-1+cap)%cap;
        deque[fr]=value;
        if(sz==0)
        re=fr;
        sz++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())
        return false;

        re=(re+1)%cap;
        deque[re]=value;
        if(sz==0)
        re=fr;
        sz++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())
        return false;

        fr=(fr+1)%cap;
        sz--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())
        return false;
        re=(re-1+cap)%cap;

        sz--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty())
        return -1;
        return deque[fr];
    }
    
    public int getRear() {
        if(isEmpty())
        return -1;
        return deque[re];
    }
    
    public boolean isEmpty() {
        return sz==0;
    }
    
    public boolean isFull() {
        return sz==cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */