/*DFS 1번(백준 15649 - n과 m)
//column의 깊이(depth값)를 기반으로 visited , arr 배열 작성
//DFS 구현 시 depth == m이다? -> 종료
//arr[depth]에는 들어갈 수 있는 수들을 작성
//재귀로 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        arr = new int[m];

        DFS(0);
        System.out.println(sb);
    }

    static void DFS(int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[depth]) {
                visited[i] = true;
                arr[depth] = i + 1;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
 */