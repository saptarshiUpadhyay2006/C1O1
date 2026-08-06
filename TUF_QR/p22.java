package TUF_QR;
import java.util.Stack;
class p22{
    public int[] nextLargerElement(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            int curr=arr[i];
            while(!st.isEmpty() && st.peek()<=curr)
            st.pop();

            if(st.isEmpty())
            res[i]=-1;
            else
            res[i]=st.peek();

            st.push(curr);
        }
        return res;
    }
}