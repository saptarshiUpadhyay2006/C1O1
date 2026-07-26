//Remove all adj duplicates in String II(LC 1209)

package GoldmanSachs.Med;

class p51{
    public String removeDuplicates(String s, int k) {
        int i=0,n=s.length();
        int arr[]=new int[n];
        char st[]=s.toCharArray();
        for(int j=0;j<n;++j,++i)
        {
            st[i]=st[j];
            arr[i]=i>0 && st[i-1]==st[j]?arr[i-1]+1:1;
            if(arr[i]==k)
            i-=k;
        }
        return new String(st,0,i);
    }
}