//Count no. of Texts(LC 2266)
//Using a tabulation

package GoldmanSachs.Med;

class p39{
    int mod=(1000000007);
    public int countTexts(String pressedKeys) {
        int key[]=new int[] { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4 };
        int n=pressedKeys.length();
        int dp[]=new int[n + 1];
        dp[n]=1;
        for (int idx=n-1;idx>=0;idx--){
            int count=0;
            int num=pressedKeys.charAt(idx)-'0';
            int r=key[num];
            for (int i=0;i<r && idx+i< pressedKeys.length()&& pressedKeys.charAt(idx)== pressedKeys.charAt(idx+i);i++){
                count+=dp[idx+i+1];
                count%=mod;
            }
             dp[idx]=count;
        }
        return dp[0];
    }
}