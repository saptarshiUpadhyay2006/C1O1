//Consecutive number sum(LC 829)
//Optimal--------T.C:O(root(n))------S.C:O(1)
//USING THE LC TEMPLATE

package Atlassian.Hard;

class p7{
    public int consecutiveNumbersSum(int n) {
        int cnt=0;
        for(int i=1;2*n>(i*(i-1));i++){
            int num=n-(i*(i-1))/2;
            int den=i;
            if(num%den==0){
                cnt++;
            }
        }
        return cnt;
    }
}