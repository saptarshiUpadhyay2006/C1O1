//Group Anagrams(LC 49)
//Optimal Approach---Use HashMap----T.C:O(nmlogm)------S.C:O(nm)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;

class p7{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(mp.get(s)!=null)
            {
                List<String> l=mp.get(s);
                l.add(strs[i]);
                mp.put(s,l);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                mp.put(s,l);
            }
        }
        for(Map.Entry<String,List<String>> x:mp.entrySet())
        res.add(x.getValue());

        return res;
    }
}