//Power of three(LC 326)
//3^19 is highest int value...solve by mod of this with n.

package GoldmanSachs.Med;

class p106{
    public boolean isPowerOfThree(int n) {
        int maxi=(int)Math.pow(3,19);
        return n>0 && maxi%n==0;
    }
}