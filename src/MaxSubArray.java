public class MaxSubArray {

    public static void main(String[] args) {
        int [] a = {1,2,3,-6,2,4};
        int [] b = maxset(a);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]+" ");
        }

    }

    public static int[] maxset(int[] A) {

        if (A.length == 0) return new int[0];

        int maxStart = 0;
        int curStart = 0;
        int maxEnd = 0;
        int curEnd = 0;
        long maxSum = 0;
        int maxLength = 0;
        int curLength = 0;
        long curSum = 0;

        for (int i = 0; i < A.length; i++){
            int currentNum = A[i];

            if (currentNum < 0){
                curStart = i + 1;
                curSum = 0;
                curLength = 0;
                continue;
            }
            curSum += currentNum;
            curLength++;

            if (maxSum < curSum || (maxSum == curSum && curLength > maxLength)){
                maxSum = curSum;
                maxEnd = i;
                maxStart = curStart;
                maxLength = curLength;
            }
        }
        if (maxLength == 0) return new int[0];
        int [] newArray = new int [maxEnd - maxStart + 1];
        for (int i = maxStart; i <= maxEnd; i++){
            newArray[i-maxStart] = A[i];
        }

        return newArray;
    }


    public static int maxSubArray(final int[] A) {

        if (A.length == 0) return 0;

        long maxSum = A[0];
        long curSum = A[0];

        for (int i = 1; i < A.length; i++){
            long curNum = A[i];
            if (curSum + curNum < curNum){
                curSum = curNum;
            }
            else {
                curSum += curNum;
            }

            if (curSum >= maxSum){
                maxSum = curSum;
            }
        }

        return (int) maxSum;
    }


}

