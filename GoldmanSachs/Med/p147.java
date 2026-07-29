//Palindrome Pairs(LC 336)

package GoldmanSachs.Med;
import java.util.*;
class p147{
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> mp=new HashMap<>();
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++)
            mp.put(words[i],i);
        for(int i=0;i<words.length;i++){
            if(words[i].equals("")){
                for(int j=0;j<words.length;j++){
                    String w=words[j];
                    if(isPal(w,0,w.length()-1)&&j!=i){
                        arr.add(List.of(i,j));
                        arr.add(List.of(j,i));
                    }
                }
                continue;
            }
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            String bw=sb.toString();
            if(mp.containsKey(bw)){
                int res=mp.get(bw);
                if(res!=i) 
                arr.add(List.of(i,res));
            }
            for(int j=1;j<bw.length();j++){
                if(isPal(bw,0,j-1)){
                    String s=bw.substring(j);
                    if(mp.containsKey(s))
                        arr.add(List.of(i,mp.get(s)));
                }
                if(isPal(bw,j,bw.length()-1)){
                    String s=bw.substring(0,j);
                    if(mp.containsKey(s))
                        arr.add(List.of(mp.get(s), i));
                }
            }
        }
        return arr;
    }
    
    private boolean isPal(String word, int i, int j) {
        while(i<j)
            if(word.charAt(i++)!=word.charAt(j--))
            return false;
        return true;
    }
}