import com.sun.javafx.collections.MappingChange;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {

    static int sherlockAndAnagrams(String s) {
        int count = 0;
        Map <String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length() - i; j++){
                String subi = s.substring(j,j+i+1);
                char [] sorted = subi.toCharArray();
                Arrays.sort(sorted);
                String sortedSubi = String.valueOf(sorted);
                System.out.println(sortedSubi);
                if (!map.containsKey(sortedSubi)){
                    map.put(sortedSubi,1);
                }
                else{
                    count += map.get(sortedSubi);
                    map.put(sortedSubi,map.get(sortedSubi)+1);

                }
            }
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
