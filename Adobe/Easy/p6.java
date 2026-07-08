//Minm Index sum of 2 lists(LC 599)
//Optimal Approach---Use HashMap----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Adobe.Easy;
import java.util.*;
class p6{
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> arr=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            mp.put(list1[i],i);
        }

        for(int j=0;j<list2.length;j++)
        {
            if(mp.containsKey(list2[j])){
                int s=mp.get(list2[j])+j;
                if(s<mini)
                {
                    mini=s;
                    arr.clear();
                    arr.add(list2[j]);
                }
                else if(s==mini)
                arr.add(list2[j]);
            }
        }
        String s[]=new String[arr.size()];
        for(int i=0;i<arr.size();i++)
        s[i]=arr.get(i);

        return s;
    }
}