package LeetCode150.Math;

public class Sqrt {
    public int mySqrt(int x) {
        if(x==0 || x==1)return x;

        int start = 1;
        int end = x;
        int mid = 0;

        while(start <= end){
            mid = start + (end-start)/2;

            if((long) mid*mid > (long)x){
                end = mid-1;
            }
            else if((long)mid*mid == x)return mid;

            else {
                start = mid+1;
            }
        }
        return Math.round(end);
    }

    public double suqareRoot(double n, float l) {
        // Assuming the sqrt of n as n only
        double x = n;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true)  {
            count++;

            // Calculate more closed x
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < l) {
                break;
            }
            x = root;
        }
        return root;
    }
}
