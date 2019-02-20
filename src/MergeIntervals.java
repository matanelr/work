import java.util.ArrayList;


class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class MergeIntervals {
    public static void main(String[] args){

    ArrayList<Interval> a = new ArrayList<Interval>();
    a.add(new Interval(1,3));
    a.add(new Interval(7,10));
    insert(a, new Interval(5,20));
    for (Interval cur : a){
        System.out.println("[" + cur.start + "," + cur.end + "]");
    }

    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        boolean isInseret = false;
        if (intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }

        for (int i = 0; i < intervals.size(); i++){
            Interval current = intervals.get(i);
           if (current.start >= newInterval.start && !isInseret){
               intervals.add(i,newInterval);
               isInseret = true;
           }
        }

        if (!isInseret) intervals.add(newInterval);

        return mergei(intervals);

    }

    public static ArrayList<Interval> mergei(ArrayList<Interval> intervals){

        ArrayList<Interval> res = new ArrayList<Interval>();

        for (int i = 0; i < intervals.size() - 1; i++){
            Interval prev = intervals.get(i);
            Interval current = intervals.get(i + 1);
            if (current.start <= prev.end){
                prev.start = Math.min(current.start, prev.start);
                prev.end = Math.max(current.end, prev.end);
                intervals.remove(i + 1);
                i--;
            }
            else{
                res.add(prev);
            }
        }

        res.add(intervals.get(intervals.size() - 1));

        return intervals;
    }

}
