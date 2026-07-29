//Find winner of an array game(LC 1535)

package GoldmanSachs.Med;

class p238{
    public int getWinner(int[] arr, int k) {
        int cur=arr[0],win=0;
        for(int i=1;i<arr.length;++i){
            if(arr[i]>cur){
                cur=arr[i];
                win=0;
            }
            if(++win==k) 
            break;
        }
        return cur;
    }
}
