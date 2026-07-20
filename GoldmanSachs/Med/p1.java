//Pairs of Songs With Total Durations Divisible by 60(LC 1010)
//similar logic like two sum must satisfy (t+x)%60=0...tweak this.

package GoldmanSachs.Med;

class p1{
    public int numPairsDivisibleBy60(int[] time) {
        int arr[]=new int[60];
        int res=0;
        for(int t:time)
        {
            res+=arr[(600-t)%60];
            arr[t%60]+=1;
        }
        return res;
    }
}