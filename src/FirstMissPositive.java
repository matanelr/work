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


    public int maxSpecialProduct(int[] A) {

        int maxLeft = 0;
        int maxRight = 0;
        int curi = 0;

        int maxProduct = 0;

        Stack<Integer> st = new Stack<Integer>();

        if (A.length <= 2) return 0;

        for (int i = 0; i < A.length - 1; i++){
        
        }


    }

}
