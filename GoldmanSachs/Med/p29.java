//Minm moves to capture the Queen(LC 3001)
//check the optimal moves and compare accordingly

package GoldmanSachs.Med;

class p29{
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a==e||b==f){
            if(a==e&&a==c&&((d-b)*(d-f)<0)) 
            return 2;
            if(b==f&&b==d&&((c-a)*(c-e)<0)) 
            return 2;
            
            return 1;
        }
        if(Math.abs(c-e)==Math.abs(d-f))
        {
            if(Math.abs(c-a)==Math.abs(d-b)&&Math.abs(e-a)==Math.abs(f-b)&&((b-f)*(b-d)<0)) 
            return 2;
            
            return 1;
        }
        return 2;
    }
}