package DSA;

import java.util.Arrays;

public class prims_algo {
     public static void prims(int[][] graph,int src) {
        int v = graph.length;
        int [] ans = new int[v];
        boolean[] MST = new boolean[v];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] =0;
        for(int i =0;i<v-1;i++){ // source node already min dis me ho gyi h isliye v-1 node tk traverse karenge;
            int u = minDIstance(ans,MST); // u ka min sitance nikala aur ans me store kr diya;
            MST[u]= true;
            for(int x = 0;x<v;x++){ // khudki node ka dis khudse 0 hi hoga;
                if(!MST[x]&&graph[u][x]!=0 && ans[u]+graph[u][x]<ans[x]){ // sptSet me jo nhi h wo chek krenge, jis node ka dis 0 h unko chek nhi karenge, if jo ans me already value h wo badi h recent ans se to value ko recent ans se update kr denge;
                    ans[x] = ans[u]+graph[u][x];
                }
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
    }
    public static int minDIstance(int[]ans,boolean[]sptSet) {
        int min = Integer.MAX_VALUE , idx =-1;
        for(int i =0;i<ans.length;i++){
            if(!sptSet[i]&& ans[i]<min){
                min = ans[i];
                idx =i;
            }
        }
        return idx;    
    }
    public static void main(String[] args) {
        int[][]graph = {{0,1,0,2,0,0},{1,0,3,1,0,0},{0,3,0,0,2,4},{2,1,0,0,1,0},{0,0,2,1,0,1},{0,0,4,0,1,0}};
        prims(graph,0);
    }
}
