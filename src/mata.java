import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class mata {
    public static void main(String[] args) {
        String[] L = {"a.b@example.com", "x@example.com", "x@exa.mple.com", "ab+1@example.com", "y@example.com", "y@example.com", "y@example.com" };
       // System.out.println(solun(L));
        int[] A = {1,2,1,2,1,1,1};
        System.out.println(garden(A));
    }

    public static int solun(String[] L) {
        Map<String, Integer> map = new HashMap<String, Integer>();
       map.hashCode();
        int countGroups = 0;
        for (String address : L) {
            String[] seperate = address.split("@");
            String formattLocal = seperate[0].replaceAll("[\\+(.+)|.]", "");
            String newLocalDomain = formattLocal + "@" + seperate[1];
            System.out.println(newLocalDomain);
            if (!map.containsKey(newLocalDomain)) {
                map.put(newLocalDomain, 1);
            } else {
                map.put(newLocalDomain, map.get(newLocalDomain) + 1);
                if (map.get(newLocalDomain) == 2) countGroups++;
            }
        }
        return countGroups;
    }

    public static int garden(int[] A) {
        final int numGarden = A.length;
        int maxSum = 0;
        int currentSum = 1;
        int fruit1 = A[0];
        int fruit2 = - 1;
        for (int i = 1; i < numGarden; i++){

           // System.out.println(currentSum);
            if (fruit2 == -1){
                currentSum++;
                if (A[i] != fruit1){
                    fruit2 = A[i];


                }

            }
            else{
                System.out.println(maxSum);
                if (A[i] == fruit1 || A[i] == fruit2){
                    currentSum++;
                }
                else {

                    maxSum = maxSum < currentSum ? currentSum : maxSum;
                    fruit1 = A[i - 1];
                    fruit2 = A[i];
                    currentSum = 2;
                }
            }

        }
        return maxSum < currentSum ? currentSum : maxSum;

    }
}
