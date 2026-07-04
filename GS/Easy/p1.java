//First Unique Character in String(LC 387)
//Brute force Approach----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package GS.Easy;

class p1{
    public int firstUniqChar(String s) {
        int n=s.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        int c=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[s.charAt(i)-'a']==1)
            {
                c=i;
                break;
            }
        }
        return c;
    }
}