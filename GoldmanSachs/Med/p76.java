//Asteroid Collision(LC 735)
//using stack & checking the condns

package GoldmanSachs.Med;
import java.util.*;
class p76{
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int i=0;
        Stack<Integer> st=new Stack<>();
        while(i<n)
        {
            if(asteroids[i]>0)
            st.push(asteroids[i]);
            else{
                if(st.isEmpty()||st.peek()<0)
                st.push(asteroids[i]);
                else if(Math.abs(st.peek())==Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                else if(Math.abs(st.peek())<Math.abs(asteroids[i]))
                {
                    st.pop();
                    continue;
                }
            }
            i++;
        }
        int sz=st.size();
        int arr[]=new int[sz];
        sz--;
        while(!st.isEmpty())
        arr[sz--]=st.pop();

        return arr;
    }
}