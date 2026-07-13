//Online election(LC 911)
//Optimal---------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p9{
    int times[],le[];
    public p9(int[] persons, int[] times) {
        int n=persons.length;
        this.times=times;
        le=new int[n];
        int v[]=new int[n];
        int mv=0,l=-1;
        for(int i=0;i<n;i++)
        {
            int p=persons[i];
            int t=times[i];
            v[p]++;
            if(v[p]>=mv)
            {
                mv=v[p];
                l=p;
            }
            le[i]=l;
        }
    }
    
    public int q(int t) {
        int lo=0,hi=times.length-1;
        while(lo<hi)
        {
            int m=(lo+hi+1)/2;
            if(times[m]<=t)
            lo=m;
            else
            hi=m-1;
        }
        return le[lo];
    }
}