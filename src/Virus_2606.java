import java.util.Scanner;


public class Virus_2606 {

    static int C;
    static int L;
    static int V;
    static int graph[][];
    static int N;
    static boolean visited[];

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt(); // 정점의 수
        L = sc.nextInt(); // 간선의 수
        V = 1; // 시작 정점의 번호

        graph = new int[C+1][C+1];
        visited = new boolean[C+1];


        for(int i = 0; i < L; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph [x][y] = 1;
            graph [y][x] = 1;
        }
        dfs(V);
        System.out.print(N);
    }
    public static void dfs(int v){
        visited [v] = true;
        for (int i = 1; i < C+1 ; i++){
            if (graph[v][i]==1 && !visited[i]){
                dfs(i);
                N++;
            }
        }

    }


}
