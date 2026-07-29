//Snapshot array(LC 1146)
//Using a treemap

package GoldmanSachs.Med;
import java.util.*;
class SnapshotArray{
    TreeMap<Integer, Integer>[] snapToValue;
    int currentSnap;
    public SnapshotArray(int length) {
        currentSnap=-1;
        snapToValue=new TreeMap[length];
        while(length!=0){
            snapToValue[--length]=new TreeMap<>();
            snapToValue[length].put(currentSnap, 0);
        }
        currentSnap++;
    }
    public void set(int index, int val) {
        if(snapToValue[index].lastEntry().getValue()==val){
            return;
        }
        snapToValue[index].put(currentSnap,val);
    }
    
    public int snap() {
        return currentSnap++;
    }
    
    public int get(int index, int snap_id) {
        return snapToValue[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */