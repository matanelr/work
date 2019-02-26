import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchProblems {

    public static void main(String[] args){
  int [] a = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10};
  System.out.println(findCount(a,1));
    }


    public static int findCount(final int[] A, int B) {

       int count = binarySear(A, B, 0);
       return count;

    }

    public static int binarySear(int [] A, int B, int count){
        int start = 0;
        int end = A.length - 1;

        while (start <= end){
            int med = (start + end) / 2;

            if (A[med] == B){
                count++;

                    int cur1 = med + 1;
                    while (cur1 < A.length  && A[cur1] == B){
                        count++;
                        cur1++;
                    }


                    int cur2 = med - 1;
                    while (cur2 >= 0 && A[cur2] == B){
                        count++;
                        cur2--;
                    }


                return count;

            } else {
                if (A[med] < B){
                   start = med + 1;
                }
                else{
                    end = med - 1;
                }
            }
        }
        return -1;
    }

    public int findMin(final List<Integer> a) {

        int [] arr = new int[a.size()];
        int i = 0;

        for (Integer n: a){
            arr[i] = n;
            i++;
        }

        int low = 0;
        int high = arr.length - 1;
        int n = arr.length;


        while (low <= high){

            int mid = (low + high) / 2;
            int prev =  (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return arr[mid];
            }

            if (arr[low] <= arr[high]){
                return arr[low];
            }

            if (arr[mid] >= arr[low]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return arr[low];
    }
}
