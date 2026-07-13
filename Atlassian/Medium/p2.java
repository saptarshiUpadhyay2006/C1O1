//Design a Stack With Increment Operation(LC 1381)
//Optimal----Basics op of stack-----T.C:O(1)--Increment:O(n)----S.C:O(1)--Increment:O(n)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p2{
    Stack<Integer> s1;
    Stack<Integer> s2;
    int cs,ms;
    public p2(int maxSize) {
        cs=0;
        ms=maxSize;
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        if(cs<ms)
        {
            s1.push(x);
            cs++;
        }
    }
    
    public int pop() {
        if(cs==0)
        return -1;

        cs--;
        return s1.pop();
    }
    
    public void increment(int k, int val) {
        while(s1.size()!=0)
        s2.push(s1.pop());

        while((s2.size()!=0) && (k>0))
        {
            s1.push(s2.pop()+val);
            k--;
        }
        while(s2.size()!=0)
        s1.push(s2.pop());
    }
}
