//Shortest Distance to a Character(LC 821)
//Optimal Approach---Normal looping & search----T.C:O(nk)------S.C:O(n+k)
//USING THE LC TEMPLATE

package Adobe.Easy;

import java.util.*;
class p2{
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        List<Integer> occ=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            occ.add(i);
        }
        for(int i=0;i<n;i++)
        {
            int mini=Integer.MAX_VALUE;
            for(int j:occ)
            mini=Math.min(mini,Math.abs(j-i));
            arr[i]=mini;
        }
        return arr;

    }
}