/* LIS 유형 복습 - 가장 긴 증가하는 부분 수열
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        //배열 크기 1000도 맞는 답 , 크기가 크지 않아서 상관없음
        int[] dp = new int[n];

        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            //dp의 초기값을 1로 지정
            //각 index의 숫자가 가장 큰 수 일때 가질 수 있는 수열의 갯수
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                //i 이전의 값 중 arr[i]보다 작은 값들의 수를 세기
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i] , dp[j] + 1);
            }
        }

        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans , i);
        }
        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* LIS 유형 복습 - 가장 긴 바이토닉 부분 수열
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] dp_reverse = new int[n];

        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //앞에서 부터 커지는 부분 수열 + 뒤에서 부터 커지는 부분 수열 갯수 합이 가장 긴 바이토닉 수열일 것이다.
        //두 수열 dp , dp_reverse는 겹치는 지점이 존재하며, 이 값 중 최댓값을 반환하면 됨

        //앞에서 부터 커지는 수열의 최대 갯수
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i] , dp[j] + 1);
            }
        }

        //뒤에서 부터 커지는 수열의 최대 갯수
        for (int i = n - 1; i >= 0; i--) {
            dp_reverse[i] = 1;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] > arr[j]) dp_reverse[i] = Math.max(dp_reverse[i] , dp_reverse[j] + 1);
            }
        }

        //두 값은 결국 같은 지점을 공유하게 된다.
        //예시
//        10
//        1 5 2 1 4 3 4 5 2 1
        //dp / dp_reverse
//        1     1
//        2     5
//        2     2
//        1     1
//        3     4
//        3     3
//        4     3
//        5     3       이 경우가 가장 긴 바이토닉 수열 5(1 , 2 , 3 , 4 , 5) + 3(1 , 2 , 5)
//        2     2
//        1     1
        int ans = 0;
        for (int i = 0; i < n; i++) {
            //dp 와 dp_reverse가 가장 큰 수를 공유하고 있으므로 - 1
            ans = Math.max(ans , dp[i] + dp_reverse[i] - 1);
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */