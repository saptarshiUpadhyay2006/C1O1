//Count Collisions of Monkeys on a Polygon(LC 2550)
//Bitwise & checking

package GoldmanSachs.Med;

class p45{
    public int monkeyMove(int n) {
        long r=1,b=2,mod=(long)1e9+7;
        while(n>0)
        {
            if(n%2==1)
            r=r*b%mod;

            b=b*b%mod;
            n>>=1;
        }
        return (int)((r-2+mod)%mod);
    }
}