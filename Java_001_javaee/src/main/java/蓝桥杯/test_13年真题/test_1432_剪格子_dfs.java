package 蓝桥杯.test_13年真题;
import java.util.*;
public class test_1432_剪格子_dfs {
    private static int[][] matrix;
    private static int n, m;
    private static int min = 200, sum = 0;
    private static int total = 0, num = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        matrix = new int[n][m];
        int[][] visited = new int[n][m];

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j];
            }
        }
        sum /= 2;

//        for(int i = 0 ; i < n; i++){
//            for(int j = 0 ; j < m; j++){
//
//                dfs(visited,matrix, i, j);
//            }
//        }
        dfs(visited,matrix, 0, 0);

        System.out.println(min);


    }


    public static void dfs(int[][] visited,int[][] matrix, int x, int y){
        visited[x][y] = 1;
        total += matrix[x][y];
        num++;
        if(total  == sum){
            min = Math.min(min, num);
        }

        if(y+1 < m && visited[x][y+1] == 0 && total < sum && min > num) dfs(visited, matrix, x, y + 1);
        if(total > sum){
            visited[x][y] = 0;
            total -= matrix[x][y];
            num--;
            return;
        }
        if(x+1 < n && visited[x+1][y] == 0 && total < sum && min > num) dfs(visited, matrix, x + 1, y);
        if(total > sum){
            visited[x][y] = 0;
            total -= matrix[x][y];
            num--;
            return;
        }
        if(y-1 >= 0 && visited[x][y-1] == 0 && total < sum && min > num) dfs(visited, matrix, x, y - 1);
        if(total > sum){
            visited[x][y] = 0;
            total -= matrix[x][y];
            num--;
            return;
        }
        if(x-1 >= 0 && visited[x-1][y] == 0 && total < sum && min > num) dfs(visited, matrix, x - 1, y);
        if(total > sum){
            visited[x][y] = 0;
            total -= matrix[x][y];
            num--;
            return;
        }
        visited[x][y] = 0;
        total -= matrix[x][y];
        num--;
    }

}
