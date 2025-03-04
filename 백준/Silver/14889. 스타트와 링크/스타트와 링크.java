import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , min , team_Start , team_List , cnt;
    static int[][] status;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        status = new int[n][n];
        visited = new boolean[n];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                status[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(0 , 0);
        System.out.println(min);
    }
    static void DFS(int k , int depth) {
        if (depth == n / 2) {
            team_Start = 0;
            team_List = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (visited[i] && visited[j]) {
                        team_Start += status[i][j] + status[j][i];
                    } else if (!visited[i] && !visited[j]) {
                        team_List += status[i][j] + status[j][i];
                    }
                }
            }
            int sub = Math.abs(team_Start - team_List);
            min = Math.min(min , sub);
            if (min == 0) {
                System.out.println(0);
                System.exit(0);
            }
        } else {
            for (int i = k; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    DFS(i + 1 , depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}