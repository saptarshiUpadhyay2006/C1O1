//Valid arrangement of pairs(lc 2097)
//DFS APPROACH

package GoldmanSachs.Med;
import java.util.*;
class p25{
    public int[][] validArrangement(int[][] pairs) {
        int n = pairs.length;
        Map<Integer, List<Integer>> mp1=new HashMap<>();
        Map<Integer, Integer> in=new HashMap<>(), out = new HashMap<>();
        for(int i=0;i<n;i++){
            int pair[]= pairs[i];
            if(!mp1.containsKey(pair[0])) {
                mp1.put(pair[0], new ArrayList<>());
            }
            mp1.get(pair[0]).add(pair[1]);
            in.put(pair[1], in.getOrDefault(pair[1], 0) + 1);
            out.put(pair[0], out.getOrDefault(pair[0], 0) + 1);
        }
        int str=-1;
        for(int key:out.keySet()){
            if(out.get(key)-in.getOrDefault(key, 0) == 1) {
                str=key;
                break;
            }
        }
        if(str == -1) 
        str = pairs[0][0];
        Stack<Integer> st=new Stack<>();
        List<Integer> res=new ArrayList<>();
        st.push(str);
        while(!st.isEmpty()) {
            int top=st.peek();
            int outdeg=out.getOrDefault(top, 0);
            if(outdeg==0) {
                res.add(st.pop());
            } 
            else 
            {
                st.push(mp1.get(top).get(outdeg-1));
                out.put(top, outdeg-1);
            }
        }
        int arr[][]=new int[n][2];
        int k=0;
        for(int i=res.size()-1; i>0; i--) {
            arr[k][0]=res.get(i);
            arr[k][1]=res.get(i-1);
            k++;
        }
        return arr;
    }
}