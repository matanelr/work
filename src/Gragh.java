import java.util.LinkedList;

public class Gragh {
    int v;
    public LinkedList<Integer> [] children;

    public Gragh(int v){
        this.v = v;
        children = new LinkedList [v];
        for (int i = 0; i < v; i++){
            children[i] = new LinkedList<Integer>();
        }

    }
}


