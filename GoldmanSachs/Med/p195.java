//Next Greater element II(LC 503)
//using a stack

package GoldmanSachs.Med;
import java.util.*;
class p195{
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {
            int c=nums[i%n];
            while(!st.isEmpty() && st.peek()<=c)
            st.pop();

            if(i<n)
            arr[i]=st.isEmpty()?-1:st.peek();

            st.push(c);
        }
        return arr;
    }
}
