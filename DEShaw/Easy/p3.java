//Find maxm divisibility score(LC 2644)
//greedy

package DEShaw.Easy;

class p3{
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int result = Integer.MAX_VALUE;

        for (int d : divisors) {
            int count = 0;

            for (int num : nums) {
                if (num % d == 0) {
                    count++;
                }
            }

            if (count > maxScore) {
                maxScore = count;
                result = d;
            } else if (count == maxScore) {
                result = Math.min(result, d);
            }
        }

        return result;
    }
}
