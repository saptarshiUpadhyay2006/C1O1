//Design Circular Queue(LC 622)


package GoldmanSachs.Med;

class MyCircularQueue {
    private int[] queue;
    private int fr;
    private int rr;
    private int sz;

    public MyCircularQueue(int k) {
        queue=new int[k + 1]; 
        sz=k+1;
        fr=0;
        rr=0;
    }

    public boolean enQueue(int value) {
        if(isFull()) 
        return false;
        queue[rr]=value;
        rr=(rr+1)%sz;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) 
        return false;
        fr=(fr+1)%sz;
        return true;
    }

    public int Front() {
        if(isEmpty()) 
        return -1;
        return queue[fr];
    }

    public int Rear() {
        if(isEmpty()) 
        return -1;
        return queue[(rr-1+sz)%sz];
    }

    public boolean isEmpty() {
        return fr==rr;
    }

    public boolean isFull() {
        return (rr+1)%sz==fr;
    }
}