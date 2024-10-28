/* 백준 1932 - 정수 삼각형 복습
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        //정수 삼각형을 담을 table을 작성
        //n x n의 크기를 가진 정사각형으로 설정하고 삼각형을 담는다.
        //나머지 빈 부분은 모두 0으로 설정
        //->역순으로 더하는 경우 아래부터 dp를 이용해 더해나간다.
        //  이 경우 빈 부분으로 뻗어나가는 dp는 (0,0)에 위치한 값을 더하지 않았으므로 항상 최솟값을 가진다.
        //즉, 최댓값은 항상 dp_triangle[0][0]값이다.
        int[][] dp_triangle = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                //삼각형을 담는 과정에서 남는 부분은 0으로 처리
                if (j <= i) dp_triangle[i][j] = Integer.parseInt(st.nextToken());
                else dp_triangle[i][j] = 0;
            }
        }

        //n번째 column부터 dp를 사용
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < n; j++) {
                dp_triangle[i - 1][j - 1] += Math.max(dp_triangle[i][j] , dp_triangle[i][j - 1]);
            }
        }
        //최댓값은 항상 (0,0)
        bw.write(dp_triangle[0][0] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */