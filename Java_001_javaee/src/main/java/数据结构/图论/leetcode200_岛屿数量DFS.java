package 数据结构.图论;

public class leetcode200_岛屿数量DFS {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
            };
        System.out.println(numIslands(grid));
    }
    private static int[][] visited;
    public static int numIslands(char[][] grid) {
        int res = 0;
        int n = grid.length;
        int m = grid[0].length;
        visited = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    dfs(grid,i,j,n,m);
                    res++;
                }
            }
        }
        return res;
    }

    public static void dfs(char[][] grid,int x, int y,int n, int m){

        visited[x][y] = 1;
        if(y + 1 < m && grid[x][y+1] == '1' && visited[x][y+1] == 0) dfs(grid, x, y+1, n, m);
        if(y - 1 >= 0 && grid[x][y-1] == '1' && visited[x][y-1] == 0) dfs(grid, x, y-1, n, m);
        if(x + 1 < n && grid[x+1][y] == '1' && visited[x+1][y] == 0) dfs(grid, x+1, y, n, m);
        if(x - 1 >= 0 && grid[x-1][y] == '1' && visited[x-1][y] == 0) dfs(grid,x - 1, y, n, m);

    }

}
