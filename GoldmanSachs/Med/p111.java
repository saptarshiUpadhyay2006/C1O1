//Third maxm number(LC 414)
//Using a treeset to store in unique sorted order as compared to hashset

package GoldmanSachs.Med;
import java.util.*;
class p111{
    public int thirdMax(int[] nums) {
        TreeSet<Integer> st=new TreeSet<>();
        for (int x:nums)
            st.add(x);
        if (st.size()<3)
            return st.last();
        st.pollLast();
        st.pollLast();

        return st.last();
    }
}