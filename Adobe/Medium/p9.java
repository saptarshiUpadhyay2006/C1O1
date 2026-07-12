//Maxm area of a piece of cake after horizontal & vertical cur(LC 1465)
//Optimal----Use dp-----T.C:O(n)^2------S.C:O(n)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class Solution {
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