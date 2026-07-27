//Course schedule II(LC 210)
//Using a dfs+stack approach

package GoldmanSachs.Med;
import java.util.*;
class p98{
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=numCourses;
        boolean vis[]=new boolean[n];
        boolean rec[]=new boolean[n];
        int idx=0;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        arr.add(new ArrayList<>());

        for(int p[]:prerequisites)
        arr.get(p[1]).add(p[0]);

        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                if(dfs(arr,i,vis,rec,st))
                return new int[0];
            }
        }
        while(!st.isEmpty())
        res[idx++]=st.pop();

        return res;
    }

    private boolean dfs(List<List<Integer>> arr,int curr,boolean vis[],boolean rec[],Stack<Integer> st)
    {
        vis[curr]=true;
        rec[curr]=true;
        for(int it:arr.get(curr))
        {
            if(!vis[it] && dfs(arr,it,vis,rec,st))
            return true;
            else if(rec[it])
            return true;
        }
        rec[curr]=false;
        st.push(curr);
        return false;
    }
}