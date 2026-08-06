package TUF_QR;
import java.util.*;
class p26{
    public int largestRectangleArea(int[] heights) {
       int n=heights.length;
       Stack<Integer> st=new Stack<>();
       int la=0;
       int area,nse,pse;
       for(int i=0;i<n;i++)
       {
        while(!st.isEmpty() && heights[st.peek()]>=heights[i])
        {
            int idx=st.pop();
            pse=st.isEmpty()?-1:st.peek();
            nse=i;
            area=heights[idx]*(nse-pse-1);
            la=Math.max(la,area);
        }
        st.push(i);
       }
       while(!st.isEmpty())
       {
        nse=n;
        int idx=st.pop();
        pse=st.isEmpty()?-1:st.peek();
        area=heights[idx]*(nse-pse-1);
        la=Math.max(la,area);
       }
       return la;
    }
}
