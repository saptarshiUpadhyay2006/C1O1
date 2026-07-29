//Triangle(LC 120)

package GoldmanSachs.Med;
import java.util.*;
class p201{
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        List<Integer> dp=new ArrayList<>(triangle.get(n-1));
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                int curr=Math.min(dp.get(j),dp.get(j+1))+triangle.get(i).get(j);
                dp.set(j,curr);
            }
        }
        return dp.get(0);
    }
}