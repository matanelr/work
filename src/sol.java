import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arrToken = s.trim().split("[ !,?.\\_'@]+");
        if (s.length() > (int) 4 * Math.pow(10, 5)) return;
        if (s == null || s.equals("") || s.trim().equals("")) System.out.println("0");
        else {
            System.out.println(arrToken.length);
            for (String st : arrToken) {
                System.out.println(st);
            }
        }
        scan.close();
    }
}
