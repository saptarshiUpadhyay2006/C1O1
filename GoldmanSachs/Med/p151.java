//Implement Stack using Queue(LC 225)
//Initialize Queue and operate accordingly

package GoldmanSachs.Med;
import java.util.*;
class p151{
    private Queue<Integer> q;

    public p151() {
        q=new LinkedList<>();    
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        q.add(q.poll());
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */