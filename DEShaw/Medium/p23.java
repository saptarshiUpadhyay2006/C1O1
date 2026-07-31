//Insert Delete GetRandom O(1)(LC 380)

package DEShaw.Medium;
import java.util.*;

class RandomizedSet {
    private ArrayList<Integer> li;
    private Map<Integer, Integer> mp;
    public RandomizedSet() {
        li=new ArrayList<>();
        mp=new HashMap<>();
    }
    public boolean search(int val) {
        return mp.containsKey(val);
    }

    public boolean insert(int val) {
        if (search(val)) 
        return false;
        li.add(val);
        mp.put(val,li.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!search(val)) 
        return false;
        int index=mp.get(val);
        li.set(index,li.get(li.size()-1));
        mp.put(li.get(index),index);
        li.remove(li.size()-1);
        mp.remove(val);
        return true;
    }

    public int getRandom() {
        Random rand=new Random();
        return li.get(rand.nextInt(li.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */