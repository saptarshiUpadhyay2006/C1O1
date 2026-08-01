//Number of Ways to Select Buildings(LC 2222)

package DEShaw.Medium;

class p57{
    public long numberOfWays(String s) {
        long o=0,z=0,oz=0,zo=0,w=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='0'){
                ++z;
                oz+=o;
                w+=zo;
            }
            else 
            {
                ++o;
                zo+=z;
                w+=oz;
            }
        }
        return w;
    }
}
