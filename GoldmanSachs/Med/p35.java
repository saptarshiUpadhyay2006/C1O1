//Find the Minimum Amount of Time to Brew Potions(LC 3494)
//adjust backward after synchronize

package GoldmanSachs.Med;

class p35{
    public long minTime(int[] skill, int[] mana) {
        int n=skill.length,m=mana.length;
        long arr[]=new long[n+1];
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            arr[j+1]=Math.max(arr[j+1],arr[j])+(long)mana[i]*skill[j];

            for(int j=n-1;j>0;--j)
            arr[j]=arr[j+1]-(long)mana[i]*skill[j];
        }
        return arr[n];
    }
}