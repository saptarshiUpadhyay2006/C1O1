//Single Element in a sorted array(LC 540)
//bitwise op of all el

package GoldmanSachs.Med;

class p142{
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int x:nums)
        res^=x;

        return res;
    }
}