import java.lang.reflect.Array;
import java.util.*;

public class Wave {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i < A.length; i += 2){
            int temp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = temp;

        }

        return A;
    }

    public int repeatedNumber(final List<Integer> a) {

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < a.size(); i ++){

            int cur = a.get(i);
            if (set.contains(cur)) return cur;
            else {
               set.add(cur);
            }
        }
        return -1;
    }

    public void nextPermutation(ArrayList<Integer> a) {

        int place = 0;

        for (int i = a.size() - 1; i <= 1; i--) {
            int cur = a.get(i);
            int next = a.get(i - 1);
            if (cur > next) {
                int temp = cur;
                cur = next;
                next = temp;
                place = i;

                for (int j = i; j < a.size() - 1; j++) {
                    int cur1 = a.get(i);
                    int next1 = a.get(i + 1);
                    if (cur1 > next1) {

                    }

                }
            }

        }
    }

}
