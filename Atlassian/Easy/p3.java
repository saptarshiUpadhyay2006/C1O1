//Single Number(LC 136)
//Optimal-----Mathematical op-----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Atlassian.Easy;

class Solution {
    public int arrangeCoins(int n) {
        int s=(int)(Math.sqrt(2L*n+0.25)-0.5);
        return s;
    }
}