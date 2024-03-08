package LeetCode150.ArraysAndString;
import java.util.*;

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



class RandomizedSet {
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val) {
        return map.containsKey(val);
    }

    public boolean insert(int val) {
        if (search(val)) return false;

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!search(val)) return false;

        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

