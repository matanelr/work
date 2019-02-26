import java.util.LinkedList;
import java.util.Scanner;

public class PrettyPrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = prettyPrint(n);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
    public static int[][] prettyPrint(int A) {
        int [][] arr = new int[2 * A - 1][2 * A - 1];
        int up = 0;
        int down = A * 2 - 2;
        int right = A * 2 - 2;
        int left = 0;

        for (int i = A; i >= 2; i--){

            for (int j = left; j <= right; j++){ // fill lines
                  arr[up][j] = i;
                  arr[down][j] = i;
            }

            for (int k = up; k <= down; k++){
                arr[k][left] = i;
                arr[k][right] = i;
            }
            up++;
            down--;
            right--;
            left++;
        }

        arr[A - 1] [A - 1] = 1;
        return arr;
    }                                                                    
}
