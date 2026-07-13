//Rank Team by votes(LC 1366)
//Optimal---------T.C:O(n^2logn)------S.C:O(n^2)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p7{
    public String rankTeams(String[] votes) {
        Map<Character,int[]> mp=new HashMap<>();
        int l=votes[0].length();
        for(String v:votes)
        {
            for(int j=0;j<l;j++)
            {
                char ch=v.charAt(j);
                mp.putIfAbsent(ch,new int[l]);
                mp.get(ch)[j]++;
            }
        }
        List<Character> arr=new ArrayList<>(mp.keySet());
        Collections.sort(arr,(a,b)->{
            for(int j=0;j<l;j++)
            {
                if(mp.get(a)[j]!=mp.get(b)[j])
                return mp.get(b)[j]-mp.get(a)[j];
            }
            return a-b;
        });
        StringBuilder sb=new StringBuilder();
        for(char ch:arr)
        sb.append(ch);
        return sb.toString();
    }
}