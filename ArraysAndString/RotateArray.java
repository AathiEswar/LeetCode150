package LeetCode150.ArraysAndString;

public class RotateArray {
    public void rotateArray(int[] a, int k) {
        k = k % a.length;

        swap(a, 0, a.length - 1);
        swap(a, k, a.length - 1);
        swap(a, 0, k - 1);
    }

    public void swap(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }
}
