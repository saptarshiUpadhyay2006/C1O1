//Container With Most Water(LC 11)
//ptr approach

package DEShaw.Medium;

class p56{
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
