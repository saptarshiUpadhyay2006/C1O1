//Minm deletions to make string k-spl(LC 3085)
//using hash table

package DEShaw.Medium;

class p20{
    public int minimumDeletions(String word, int k) {
        int mini=Integer.MAX_VALUE;
        int arr[]=new int[26];
        for(final char c:word.toCharArray())
        ++arr[c-'a'];

        for(final int minFreq:arr) 
        {
            int deletions=0;
            for(final int freq:arr)
                if(freq<minFreq)
                deletions+=freq;
                else
                deletions+=Math.max(0,freq-(minFreq+k));
            mini=Math.min(mini,deletions);
        }

        return mini;
    }
}