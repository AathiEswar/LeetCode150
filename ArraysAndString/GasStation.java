package LeetCode150.ArraysAndString;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;

        for(int i=0;i<gas.length;i++){
            gasSum += gas[i];
            costSum += cost[i];
        }

        if(costSum > gasSum ) return -1;

        int total = 0;
        int res = 0;

        for(int i=0;i<gas.length;i++){
            total += gas[i] - cost[i];

            if(total < 0){
                total = 0;
                res = i+1;
            }
        }

        return res;
    }
}
