package LeetCode150.HashMap;

import java.util.HashSet;

public class HappyNumber { public boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();

    while(set.add(n) && n != 1){
        n = sqAdd(n);
    }

    return n==1;
}

    public boolean isHappyFloydsAlgo(int n) {
        //Floyds Hare and Tortoise Algorithm

        int fast = n;
        int slow = n;

        do{
            fast = sqAdd(sqAdd(fast));
            slow = sqAdd(slow);

        }while(fast != slow);

        return fast ==1;

    }

    public int sqAdd(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }

        return sum;
    }
}
