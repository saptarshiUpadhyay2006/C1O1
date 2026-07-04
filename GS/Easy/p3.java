//Power of three(LC 326)
//Brute force Approach----T.C:O(log3n)------S.C:O(log3n)
//USING THE LC TEMPLATE

package GS.Easy;
class p3{
    public boolean isPowerOfThree(int n) {
        return (Integer.toString(n,3).matches("^10*$"));
    }
}