//Group anagrams
//Creating a hashmap of string & list of strings and finding accordingly

package GoldmanSachs.Med;
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs)
        {
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String k=new String(arr);
            if(!res.containsKey(k))
            res.put(k,new ArrayList<>());

            res.get(k).add(s);
        }
        return new ArrayList<>(res.values());
    }
}