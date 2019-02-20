import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class GFG {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
            waveSort(arr);
            printArray(arr);
            LinkedList<Integer> list = new LinkedList<Integer>();
            switch (test){
                case 1:
            }
        }
    }

    public static void waveSort(int [] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
