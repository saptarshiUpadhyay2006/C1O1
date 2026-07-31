//Minm cost walk in weighted graph(LC 3108)
//dfs

package DEShaw.Hard;
import java.util.*;
class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        List<int[]> arr[]=new ArrayList[n];
        Arrays.setAll(arr,i->new ArrayList<>());
        for(int e[]:edges) {
            int x=e[0],y=e[1],w=e[2];
            arr[x].add(new int[]{y,w});
            arr[y].add(new int[]{x,w});
        }
        int ids[]=new int[n];
        Arrays.fill(ids,-1);
        List<Integer> ccAnd=new ArrayList<>();
        for (int i=0;i<n;i++){
            if(ids[i]<0){
                ccAnd.add(dfs(i,ccAnd.size(),arr,ids));
            }
        }
        int[] ax=new int[query.length];
        for(int i=0;i<query.length;i++){
            int s=query[i][0],t=query[i][1];
            ax[i]=s==t?0:ids[s]!=ids[t]?-1:ccAnd.get(ids[s]);
        }
        return ax;
    }

    private int dfs(int x,int curId,List<int[]>[] arr,int[] ids) {
        ids[x]=curId;
        int idx=-1;
        for (int[] e:arr[x]){
            idx&=e[1];
            if(ids[e[0]]<0){
                idx&=dfs(e[0],curId,arr,ids);
            }
        }
        return idx;
    }
}