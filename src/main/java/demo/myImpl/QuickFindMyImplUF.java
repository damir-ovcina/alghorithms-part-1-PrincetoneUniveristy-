package demo.myImpl;



public class QuickFindMyImplUF {

    private int[] id;

    public QuickFindMyImplUF(int N){
        this.id = new int[N];
        for(int i = 0; i< N; i ++){
            this.id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return this.id[p] == this.id[q];
    }

    public void union(int p, int q){

        int pid = this.id[p];
        int qid = this.id[q];

        for(int i = 0; i < id.length; i++){
            if(this.id[i]== pid){
                id[i] = qid;
            }
        }
    }

}
