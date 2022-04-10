package repetition;

import java.util.Arrays;

public class QuickFind_1 {

    private int[] ids;

    public QuickFind_1(int numberOfNodes) {
        this.ids = new int[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            ids[i] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        return ids[p]== ids[q];
    }

    public void connect(int p, int q) {
        if (!isConnected(p, q)) {
            int pId = ids[p];
            int qId = ids[q];
            ids = Arrays.stream(ids).map(e -> {
               e = (e == pId) ? qId : e;
               return e;
            }).toArray();
        }
    }

     public void connect(int[] connectedElements){
        this.connect(connectedElements[0],connectedElements[1]);
    }

}
