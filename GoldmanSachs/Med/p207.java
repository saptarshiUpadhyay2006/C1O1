//Word ladder(LC 127)
//use a bfs tech

package GoldmanSachs.Med;

import java.util.*;
class p207{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<AbstractMap.SimpleEntry<String,Integer>> q=new LinkedList<>();

        q.add(new AbstractMap.SimpleEntry<>(beginWord,1));
        Set<String> st=new HashSet<>(wordList);
        if(!st.contains(endWord))
        return 0;

        st.remove(beginWord);
        while(!q.isEmpty())
        {
            String w=q.peek().getKey();
            int steps=q.peek().getValue();
            q.poll();
            if(w.equals(endWord))
            return steps;

            char wordArr[]=w.toCharArray();
            for(int i=0;i<wordArr.length;i++)
            {
                char o=wordArr[i];
                for(char ch='a';ch<='z';ch++)
                {
                    wordArr[i]=ch;
                    String nw=new String(wordArr);
                    if(st.contains(nw))
                    {
                        st.remove(nw);
                        q.add(new AbstractMap.SimpleEntry<>(nw,steps+1));
                    }
                }
                wordArr[i]=o;
            }
        }
        return 0;
    }
}