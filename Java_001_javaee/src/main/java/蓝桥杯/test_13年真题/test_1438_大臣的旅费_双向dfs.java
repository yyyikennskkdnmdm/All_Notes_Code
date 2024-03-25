package 蓝桥杯.test_13年真题;
import java.util.*;

public class test_1438_大臣的旅费_双向dfs {


        private static int N=200010;//记得要开两倍，因为是双向可走的
        private static int idx;
        private static int[] ne=new int[N];
        private static int[] e=new int[N];
        private static int[] h=new int[N];
        private static int[] w=new int[N];
        private static int[] dist=new int[N];//记录起点到该点的距离
        public static void add(int a,int b,int v) {
            e[idx]=b;w[idx]=v;ne[idx]=h[a];h[a]=idx++;
        }
        public static void dfs(int x,int father,int distance) {
            for(int i=h[x];i!=-1;i=ne[i]) {
                int j=e[i];
                if(father!=j) {//若与他相连的点不是父亲（已经走过这点
                    dist[j]=distance+w[i];
                    dfs(j,x,dist[j]);
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int N=100010;
            int[] s=new int[N];
            Arrays.fill(h, -1);//记得初始化
            for(int i=0;i<n-1;i++) {
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int c=scanner.nextInt();
                add(a, b, c);add(b, a, c);//路径是双向的
            }
            dfs(1,-1,0);//任取一点，-1说明是第一个走的，没有父亲
            int max=0,y=0;
            for(int i=1;i<=n;i++) {//找与1最远的点，即y
                if(max<dist[i]) {
                    max=dist[i];
                    y=i;
                }
            }
            dfs(y, -1, 0);
            max=0;
            for(int i=1;i<=n;i++)//找与y最远的点，他们之间的距离就是树的直径
                max=Math.max(max, dist[i]);
            //long sum=(long)(max*10)+(long)(max*(max+1)/2);//不行
            //long sum=(long)(max*10)+((long)(max*(max+1))/2);//不行
            long sum=(long)(max*10)+((long)max*(max+1))/2;//(long)max先将max变为长整型
            System.out.println(sum);
        }

    }




