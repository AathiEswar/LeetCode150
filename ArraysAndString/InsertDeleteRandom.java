package LeetCode150.ArraysAndString;
import java.util.HashSet;

public class InsertDeleteRandom {


    // USING HASHSET
    HashSet<Integer> set ;
    public InsertDeleteRandom() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        if(set.contains(val))return false;

        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }

        return false;
    }

    public int getRandom() {
        int start = 0;
        int end = set.size()-1;

        int random = (int)(Math.random()*(end-start+1));
        return (int)(set.toArray()[random]);
    }
}
