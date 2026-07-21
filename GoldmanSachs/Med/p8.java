//Container with Most water(LC 11)
//using a 2 pointer approach-->compare ht and update l and r accordingly, keep trace of MaxArea

package GoldmanSachs.Med;

class p8{
    public int maxArea(int[] height) {
        int maxi=0,l=0,r=height.length-1;
        while(l<r)
        {
            maxi=Math.max(maxi,(r-l)*(Math.min(height[l],height[r])));
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return maxi;
    }
}