//String Compression(LC 443)
//basic ops and stringBuilding

package GoldmanSachs.Med;

class p11{
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int l=0,r=0;
        int n=chars.length;
        while(r<(n))
        {
            int c=0;
            while(r<n && chars[l]==chars[r] )
            {
                c++;
                r++;
            }
            sb.append(chars[l]);

            if(c>1)
            sb.append(c);
            l=r;
            
        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}