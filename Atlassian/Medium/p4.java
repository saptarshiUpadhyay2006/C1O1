//Find the City With the Smallest Number of Neighbors at a Threshold Distance(LC 1334)
//Optimal----Floyd Warshall algo-----T.C:O(n^3)------S.C:O(n^2)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p4{
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dis[][]=new int[n][n];
        for(int d[]:dis)
        {
            Arrays.fill(d,(int)1e4+1);
        }
        for(int e[]:edges)
        {
            int u=e[0],v=e[1],wt=e[2];
            dis[u][v]=wt;
            dis[v][u]=wt;
        }
        for(int i=0;i<n;i++)
        dis[i][i]=0;

        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                {
                    if(dis[i][k]==(int)1e4+1||dis[k][j]==(int)1e4+1)
                    continue;
                    else
                    dis[i][j]=Math.min(dis[i][j],dis[i][k]+dis[k][j]);
                }
            }
        }
        int cn=-1,nc=n;
        for(int i=0;i<n;i++)
        {
            int t=0;
            for(int adj=0;adj<n;adj++)
            {
                if(dis[i][adj]<=distanceThreshold)
                t++;
            }
            if(t<=nc)
            {
                cn=i;
                nc=t;
            }
        }
        return cn;

    }
}