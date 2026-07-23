//Design HashMap(LC 706)
//Use 2lists of keys & vals

package GoldmanSachs.Med;
import java.util.*;
class MyHashMap {
    List<Integer> keys;
    List<Integer> vals;
    public MyHashMap() {
        keys=new ArrayList<>();
        vals=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keys.contains(key))
        vals.set(keys.indexOf(key),value);
        else
        {
            keys.add(key);
            vals.add(value);
        }
    }
    
    public int get(int key) {
        if(!keys.contains(key))
        return -1;
        return vals.get(keys.indexOf(key));
    }
    
    public void remove(int key) {
        if(!keys.contains(key))
        return;
        int idx=keys.indexOf(key);
        keys.remove(idx);
        vals.remove(idx);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */