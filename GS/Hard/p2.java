//Reaching Points(LC 780)
//Optimal Approach----T.C:O(log(max(tx,ty)))------S.C:O(1)
//USING THE LC TEMPLATE

package GS.Hard;

class p2{
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(sx<tx && sy<ty)
        {
            if(tx<ty)
            ty%=tx;
            else
            tx%=ty;
        }
        return (sx==tx && sy<=ty && (ty-sy)%sx==0||sy==ty && sx<=tx && (tx-sx)%sy==0);
    }
}