//First Unique character(LC 387)
//Using the hash Table

package GoldmanSachs.Easy;

class p1{
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-'a';
            arr[c]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}