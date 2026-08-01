//Wildcard matching(LC 44)
//Recursion based approach----T.C:O(2^(m+n))------S.C:O(m+n)

package DEShaw.Hard;

class p22{
    public boolean isMatch(String s, String p) {
        return solve(s.length()-1,p.length()-1,s,p);
    }
    private boolean solve(int i, int j, String s, String p) {
        if(i<0&&j<0)
            return true;
        if(i>=0&&j<0)
            return false;
        if(i<0&&j>=0)
            return isAllStars(p, j);
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
            return solve(i - 1, j - 1, s, p);
        if(p.charAt(j)=='*')
            return solve(i-1,j,s,p)||solve(i,j-1,s,p);
        return false;
    }

    private boolean isAllStars(String p, int j) {
        for (int k=0;k<=j;k++){
            if(p.charAt(k)!='*')
                return false;
        }
        return true;
    }
}