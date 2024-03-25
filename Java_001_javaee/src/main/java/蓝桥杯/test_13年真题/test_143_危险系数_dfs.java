package 蓝桥杯.test_13年真题;
import java.util.*;
public class test_143_危险系数_dfs {
    private static int n, m;
    private static int[][] graph;
    private static int[] visited;
    private static int[] count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new int[n + 1][n + 1];
        for(int i = 1; i <= m; i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                graph[x][y] = 1;
                graph[y][x] = 1;
        }

        visited = new int[n + 1];
        count = new int[n + 1];

        int u = scanner.nextInt();
        int v = scanner.nextInt();
        dfs(graph, u, v);
        int res = 0;
        int max = count[u];
        for(int i = 1 ; i <= n; i++){
            if(count[i] == max){
                res++;
            }
        }
        System.out.println(max);
        System.out.println(count[u]);
        System.out.println(res - 2);
//        int res = 0;
//        int max = count[1];
//        for(int i = 1 ; i <= n; i++){
//            if(i != u && i != v){
//                max = Math.max(max, count[i]);
//            }
//        }
//
//        for(int i = 1 ; i <= n; i++){
//            if(count[i] == max && i != u && i != v){
//                res++;
//            }
//        }
//        System.out.println(max);
//        System.out.println(count[u]);
//        System.out.println(res);
    }


    public static void dfs(int[][] graph, int u, int v){
        visited[u] = 1;
        if(u == v){
            for(int i = 1; i <= n; i++){
                if(visited[i] == 1){
                    count[i]++;
                }
            }
            visited[u] = 0;
            return;
        }

        for(int i = 1; i <= n; i++){
            if(graph[u][i] == 1 && visited[i] == 0){
                dfs(graph, i, v);
            }
        }
        visited[u] = 0;
    }
}


//64 78
//        149 127
//        65 22
//        127 31
//        86 130
//        149 33
//        109 96
//        78 4
//        125 113
//        130 62
//        90 13
//        62 30
//        74 118
//        127 124
//        84 5
//        86 131
//        90 155
//        74 7
//        87 9
//        64 70
//        62 35
//        23 11
//        96 167
//        9 180
//        33 83
//        70 29
//        146 182
//        107 139
//        86 150
//        96 147
//        33 47
//        144 171
//        29 40
//        155 153
//        150 79
//        83 26
//        100 173
//        72 133
//        84 10
//        23 68
//        86 24
//        146 36
//        10 103
//        182 122
//        63 137
//        182 108
//        93 110
//        146 56
//        180 145
//        182 132
//        7 3
//        180 19
//        133 38
//        93 143
//        70 120
//        13 163
//        107 88
//        118 75
//        31 76
//        56 28
//        36 32
//        7 12
//        72 115
//        133 45
//        40 53
//        64 174
//        74 105
//        37 141
//        171 106
//        118 17
//        32 43
//        103 151
//        119 27
//        87 136
//        65 39
//        139 46
//        152 134
//        147 161
//        53 48
//        144 80
//        62 129
//        108 172
//        27 101
//        45 177
//        38 162
//        96 178
//        143 81
//        81 67
//        33 157
//        153 128
//        106 69
//        28 15
//        110 14
//        28 50
//        167 123
//        83 97
//        14 20
//        62 140
//        105 6
//        4 1
//        172 16
//        38 168
//        182 60
//        33 82
//        68 170
//        128 2
//        128 94
//        105 52
//        50 154
//        124 156
//        56 71
//        153 98
//        23 41
//        5 18
//        62 116
//        173 142
//        60 92
//        105 55
//        136 54
//        23 99
//        133 102
//        2 179
//        133 175
//        139 85
//        47 117
//        86 135
//        35 112
//        110 121
//        152 42
//        42 34
//        47 104
//        110 138
//        121 49
//        36 126
//        136 21
//        92 158
//        63 159
//        178 166
//        178 164
//        63 181
//        119 51
//        142 66
//        175 165
//        178 44
//        149 58
//        159 89
//        165 160
//        166 148
//        153 95
//        106 61
//        168 73
//        130 169
//        45 173
//        134 176
//        145 110
//        91 134
//        34 83
//        45 24
//        119 12
//        27 133
//        161 82
//        176 159
//        182 85
//        73 134
//        3 144
//        179 36
//        6

