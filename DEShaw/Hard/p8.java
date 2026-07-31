//Kth smallest in lexicographical order(LC 440)

package DEShaw.Hard;

class p8{
    public int findKthNumber(int n, int k) {
        int c=1;
        k--;
        while(k>0){
            int steps=calculateSteps(n,c,c+1);
            if(steps<=k){
                c++;
                k-=steps;
            } 
            else 
            {
                c*=10;
                k--;
            }
        }
        return c;
    }

    private int calculateSteps(int n, long curr, long next) {
        int steps=0;
        while(curr<=n) 
        {
            steps+=Math.min(n+1,next)-curr;
            curr*=10;
            next*=10;
        }
        return steps;
    }
}