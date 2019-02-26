import java.util.LinkedList;
import java.util.Scanner;

public class kickStart {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++){
            int n = sc.nextInt();
            System.out.println("Case #" + i + ": " + evenDigits(n));
        }
    }

//    public static int evenDigits(int n){
//        String num = "" + n;
//        int place = -1;
//
//        for (int i = 0; i < num.length(); i++){
//            char dig = num.charAt(i);
//
//            if (dig - 48 % 2 != 0){
//                place = i;
//                break;
//            }
//        }
//
//        if (place == -1) return 0;
//
//        String numUp = "";
//        String numDown = "";
//
//        if (num.charAt(place) == '9') {
//            switch (place){
//                case 0:
//                    numUp += "20";
//                    break;
//
//                    default:
//            }
//
//        }
//        numUp = num.substring(0, place) + (num.charAt(place) + 1);
//        int numOfZero = num.length() - place - 1;
//
//
//
//    }
}

