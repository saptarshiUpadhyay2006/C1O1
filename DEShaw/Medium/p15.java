//Letter combinations of a ph no.(LC 17)
//using a map ds

package DEShaw.Medium;
import java.util.*;
class p15{
    private final String[] map;
    public p15() {
        map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }
    private void helper(String dig, List<String> ans, int idx, String current) {
        if (idx == dig.length()) {
            ans.add(current);
            return;
        }
        String s = map[dig.charAt(idx) - '0'];
        for (int i = 0; i < s.length(); i++) {
            helper(dig, ans, idx + 1, current + s.charAt(i));
        }
    }
    public List<String> letterCombinations(String dig) {
        List<String> ans = new ArrayList<>();
        if (dig.length() == 0) return ans;
        helper(dig, ans, 0, "");
        return ans;
    }
}