/* 백준 15649 복습
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

        //1~n까지의 수 중 이미 적힌 수가 있는지 판별하는 table
        visited = new boolean[n];
        //1~m번 까지 저장할 수를 저장하는 곳
        arr = new int[m];
    }

    static void DFS(int depth) {
        //출력 설정
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            //리턴 안하면 다시 for문 작동함
            return;
        }
        //1 ~ n까지의 범위 안에 알맞는 수를 arr에 저장해야 하므로
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                visited[i] = true;
                //1 ~ m번째 수의 index값으로 depth 사용
                arr[depth] = i + 1;
                //다음 저장할 수 찾으러 출발 , 이미 저장된 수는 visited가 기억하고 있음
                DFS(depth + 1);
                //한 줄을 완료했으면 다음줄을 위해 초기화
                visited[i] = false;
            }
        }
    }
}
 */