/* DFS 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n , m;
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        //n = column
        n = Integer.parseInt(st.nextToken());
        //m = row
        m = Integer.parseInt(st.nextToken());
        //정답을 넣을 배열을 생성
        array = new int[m];

        DFS(1 , 0);
    }
    static void DFS(int t , int depth) {
        //m번째 row에 도달한 경우 답을 모두 도출 했으므로 종료
        if (depth == m) {
            for (int val : array) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = t; i <= n; i++) {
            //depth인 row에 들어갈 수 있는 수들을 입력
            array[depth] = i;
            DFS(i + 1 , depth + 1);
        }
        // 4 2의 경우
        // t = 1 부터 시작 , array[0] = 1 , DFS(2 , 1) 시작
        // array[1] = 2 , depth = 2이므로 출력
        // 다시 DFS(2 , 1)로 돌아옴 -> i = 3으로 시작
        // 위 과정 반복
    }
}
 */