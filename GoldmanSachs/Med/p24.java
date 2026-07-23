//Pair of songs with total durations divisble by 60(LC 1010)
//using divisble rules within the array indexes

package GoldmanSachs.Med;

class p24{
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