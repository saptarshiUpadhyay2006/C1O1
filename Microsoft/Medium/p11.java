//Validate stack Seq(LC 946)
//Optimal---stack ops----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Microsoft.Medium;
import java.util.*;
class p11{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int n=pushed.length,j=0;
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && popped[j]==st.peek())
            {
                st.pop();
                j++;
            }
            st.push(pushed[i]);
        }
        while(!st.empty() && popped[j]==st.peek())
        {
            st.pop();
            j++;
        }
        return st.empty() && j==n;
    }
}
