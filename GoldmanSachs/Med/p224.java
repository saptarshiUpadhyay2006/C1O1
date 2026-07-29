//Car fleet(LC 853)
//Using a monotonic stack

package GoldmanSachs.Med;
import java.util.*;
class p224{
    public int carFleet(int target, int[] position, int[] speed) {
        int pair[][]=new int[position.length][2];
        for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->b[0]-a[0]);
        Stack<Double>stack=new Stack<>();
            for(int[]cur:pair){
                stack.push((double)((target-cur[0])*1.0/cur[1]));
                if(stack.size()>=2&&stack.peek()<=stack.get(stack.size()-2)){
                    stack.pop();
                }
            }
        return stack.size();
    }
}