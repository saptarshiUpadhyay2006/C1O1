//Count no of Teams(LC 1395)
//Optimal---Use concept of ls,lg,rs,rg-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;

class Solution {
    public int numTeams(int[] rating) {
        int ls,lg,rs,rg;
        int s=0;
        int n=rating.length;
        for(int i=0;i<n;i++)
        {
            ls=0;lg=0;rg=0;rs=0;
            for(int j=0;j<n;j++)
            {
                if(j<i)
                {
                    if(rating[j]<rating[i])
                    ls++;
                    else if(rating[j]>rating[i])
                    lg++;
                }
                else if(j>i)
                {
                    if(rating[j]<rating[i])
                    rs++;
                    else if(rating[j]>rating[i])
                    rg++;
                }
            }
            s+=ls*rg+rs*lg;
        }

        return s;
    }
}