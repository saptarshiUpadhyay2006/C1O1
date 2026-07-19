//Loud & Rich(LC 851)
//Optimal--------T.C:O(n+m)------S.C:O(m+n)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=quiet.length;
        int in[]=new int[n];
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i[]:richer){
            int to=i[1];
            int from=i[0];
            arr.get(from).add(to);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).size();j++){
                int x= arr.get(i).get(j);
                in[x]++;
            }
        }
            int res[]=new int[n];
            for (int i=0;i<n;i++) 
            res[i] = i;
            Queue<Integer> queue = new LinkedList<>();
            for(int  i=0 ; i<n ; i++){
                if(in[i] == 0) queue.offer(i);
            }
            int toposort[]=new int[n];
            while(!queue.isEmpty()){
                int val=queue.poll();
                for(int node:arr.get(val)){
                     if(quiet[res[val]]<quiet[res[node]]){
                    res[node]=res[val];
                }
                in[node]--;
                if(in[node]==0){
                    queue.offer(node);
                }
            }
        }
        return res;
    }
}