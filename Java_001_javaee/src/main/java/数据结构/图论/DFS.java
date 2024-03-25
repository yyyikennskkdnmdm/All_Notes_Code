package 数据结构.图论;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {
//        int[][] g = {{1,2},{3},{3},{}};
        int[][] g = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> lists = allPathsSourceTarget(g);
        System.out.println(lists);
    }





    private static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> temp = new ArrayList<>();
        dfs(graph, 0, temp);
        return res;
    }

    public static void dfs(int[][] arr, int k, List<Integer> temp){

        for(int i = 0; i < arr[k].length; i++){
            temp.add(k);
            dfs(arr,arr[k][i],temp);
            temp.remove(temp.size() - 1);
        }

        if(k == arr.length - 1){
            temp.add(k);
            List<Integer> temp2 = new ArrayList<>(temp);
            res.add(temp2);
            temp.remove(temp.size() - 1);
        }

    }


}
