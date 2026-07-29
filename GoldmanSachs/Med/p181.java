//Ugly number II(LC 264)
//using treeSet

package GoldmanSachs.Med;
import java.util.*;
class p181{
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglyNumbersSet = new TreeSet<>();
        uglyNumbersSet.add(1L);
        Long currentUgly = 1L;
        for (int i = 0; i < n; i++) {
            currentUgly = uglyNumbersSet.pollFirst();
            uglyNumbersSet.add(currentUgly * 2);
            uglyNumbersSet.add(currentUgly * 3);
            uglyNumbersSet.add(currentUgly * 5);
        }
        return currentUgly.intValue();
    }
}