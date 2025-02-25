/* 2565
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] wire = new int[n][2];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }

        //좌측 전봇대 번호를 번호순으로 배열 후
        //우측 전봇대 번호가 크다면 -> 전선이 교차함
        //우측 전봇대 번호가 작다면 -> 전선이 교차하지 않음
        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        //전선이 교차하는 경우 = 전체 전선 갯수 - 전선이 교차하지 않는 경우
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (wire[i][1] < wire[j][1]) {
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
            }
        }

        int ans = Arrays.stream(dp).max().getAsInt();
        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 9251
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line_A = br.readLine();
        String line_B = br.readLine();

        int[][] dp = new int[line_A.length() + 1][line_B.length() + 1];
        for (int i = 1; i <= line_A.length(); i++) {
            for (int j = 1; j <= line_B.length(); j++) {
                //한 단어씩 확인
                //만일 같은 단어가 line_B에 등장한다면 -> 해당 dp 위치에 이전 dp 위치 + 1
                //같은 단어가 뒤에 하나 더 나올 수 있으므로 -> 해당 단어가 가진 dp 값과 같아짐
                if (line_A.charAt(i - 1) == line_B.charAt(j - 1)) {
                    //같은 단어가 나왔다면 dp[i-1][j-1] + 1의 값을 가짐
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
                }
            }
        }

        //가장 긴 부분수열의 길이는 결국 마지막 값이다.
        bw.write(dp[line_A.length()][line_B.length()] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */