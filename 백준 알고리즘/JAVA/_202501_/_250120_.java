/* 백준 11053 - 가장 긴 증가하는 부분 수열 (LIS - Longest Increasing Subsequence 연습 문제)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        //문제에서 주어진 배열 저장
        int[] arr = new int[n];
        //1~1000 , 연속된 수열의 갯수를 저장하는 배열
        int[] dp = new int[1001];


        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            //연산을 안한 배열은 초기값이 항상 1이다.
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                //i번째 수 이전에 있던 값들 중 큰 값이 있었는지 확인하는 작업
                //큰 값이 있었다? -> dp[i] += 1 == i번째 수 보다 작은 수가 았었다
                //j값을 순회하면서 dp[i] 값과 비교
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i] , dp[j] + 1);
                //예시 - 10 20 30 의 경우 -> i = 1일 때 dp[i] = 1;
                //                     -> i = 2일 때 dp[i] = dp[2] 와 dp[1] + 1중 큰 값 설정, 따라서 dp[i] = dp[1] + 1 = 2
                //이 과정 반복하면 dp[3] = 3
            }
        }

        int ans = 0;
        //결과값 중 가장 큰 수를 출력
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

/* 백준 11054 - 가장 긴 바이토닉 부분 수열
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

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i] , dp[j] + 1);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            dp_reverse[i] = 1;
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) dp_reverse[i] = Math.max(dp_reverse[i] , dp_reverse[j] + 1);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans , dp[i] + dp_reverse[i] - 1);
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */
