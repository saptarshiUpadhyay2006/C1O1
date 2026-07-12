//Sort Colors(LC 75)
//Optimal-----computation----T.C:O(mlogm+nlogn)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p10{
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mh=Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int mv=Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        for(int i=1;i<horizontalCuts.length;i++)
        mh=Math.max(mh,horizontalCuts[i]-horizontalCuts[i-1]);

        for(int i=1;i<verticalCuts.length;i++)
        mv=Math.max(mv,verticalCuts[i]-verticalCuts[i-1]);

        return (int)((long)mh*mv%1000000007);
    }
}