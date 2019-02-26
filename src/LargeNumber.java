import sun.invoke.empty.Empty;

import java.util.*;

public class LargeNumber {

    public static void main(String[] args) {
        int [] a = {120,0};
      String b = largestNumber(a);
            System.out.println(b);


    }

    public static String largestNumber(final int[] A) {

        int num = 9;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < A.length; i++) {
            list.add("" + A[i]);
        }
        CompareNums compareN = new CompareNums();

        Collections.sort(list, compareN);

        StringBuilder res = new StringBuilder();
        String s = "";
        for (int i = list.size() - 1; i >= 0; i--) {

            res.append(list.get(i));

        }

            if (res.charAt(0) == '0') return "0";
        return res.toString();
    }

    public static class CompareNums implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return (o1 + o2).compareTo(o2 + o1);

        }


    }

    public int solve(int[] A) {

        Map <Integer,Integer> map = new HashMap<Integer,Integer>();
        final int four = 4;
        int sumOp = 0;

        for (int i = 0; i < A.length; i++){
            int current = A[i];
            int mod = current % four;
            if (mod == 0) continue;
            if (map.containsKey(four - mod)){
                if (map.get(four - mod) == 1){
                    map.remove(four - mod);
                }
                else {
                    map.put(four - mod, map.get(four - mod) - 1);
                }

                sumOp++;
            }
            else{
                if (map.containsKey(mod)){
                    map.put(mod, map.get(mod) + 1);
                }
                else{
                    map.put(mod, 1);
                }

                if (mod == 1 || mod == 3 && map.get(mod) == 4){
                    sumOp += 3;
                    map.remove(mod);
                }
            }
        }

        if (map.size() == 0) return sumOp;



        return -1;
    }


}
