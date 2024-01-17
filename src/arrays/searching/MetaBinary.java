package arrays.searching;

public class MetaBinary {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int result = (int) (Math.log(n - 1) / Math.log(2));
        int lg = result + 1;

        int pos = 0;

        for (int i = lg; i >= 0; i--) {
            if (arr[pos] == target) return pos;

            int newPos = pos | (1 << i);

            if ((newPos < n) && (arr[newPos] <= target))
                pos = newPos;
        }

        if (arr[pos] == target) return pos;

        return -1;
    }
}
