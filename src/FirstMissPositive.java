import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class FirstMissPositive {
    public int firstMissingPositive(int[] A) {

        int minPos = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++){
            if (A[i] == minPos){
                minPos++;
            }
        }

        return minPos;
    }


    public int[] solve(int A, int[] B) {

        String [] a = new String[A];

        for (int i = 0; i < a.length; i++){
            a[i] = "" + (i + 1);
        }

        Arrays.sort(a);

        int [] res = new int[B.length];

        for (int i = 0; i < B.length; i++){
            res[i] = Integer.parseInt(a[B[i] - 1]);
        }

        return res;
    }


    public int titleToNumber(String A) {

        int sum = 0;

        for (int i = 0; i < A.length(); i++){
            int cur = A.charAt(i) - 64;
            sum += cur * Math.pow(26, A.length() - i - 1);
        }

        return sum;
    }

    public void arrange(ArrayList<Integer> a) {
        int first = 0;
        int change = 0;
        int res = 0;
        int n = a.size();

        for (int i = 0; i < n; i++){
            first = a.get(i);
            change = (a.get(first) % n) * n;
            res =  first + change;
            a.set(i, res);
        }

        for (int i = 0; i < n; i++){
            a.set(i, a.get(i) / n);
        }
    }

}








