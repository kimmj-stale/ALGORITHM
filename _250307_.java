import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static long sum , ans;
    static long[] remainder;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        sum = 0L;
        //최악의 경우가 주어진다 가정했을 때, ans 의 자료형은 long 이다.
        //10^6 개의 수 * 수 전체가 10^9 / 나머지 10^3 -> 이론적인 가장 최악의 경우 10^12 으로 ans는 정수 범위를 넘을 수 있다.
        ans = 0L;
        //m으로 나눈 나머지를 갖는 구간 합의 갯수를 담는 배열 , 나머지는 0 ~ m-1 까지 가능
        remainder = new long[m];
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            //0 ~ i 까지의 부분 합을 구한다.
            sum += Integer.parseInt(st.nextToken());
            long r =  sum % m;
            //0 ~ i 까지의 수열 중에서 m으로 나누어 떨어지는 경우
            if (r == 0) ans++;
            //위 경우가 아닌 수 중 나머지 r 을 갖는 구간 합의 갯수 저장
            remainder[(int) r]++;
        }

        for (int i = 0; i < m; i++) {
            if (remainder[i] > 1) {
                //0 ~ i 의 수 중 a < b를 만족하는 두 수 a , b를 선택하는 경우 -> 두 수 a ~ b의 구간을 선택하는 경우
                //nC2
                ans += remainder[i] * (remainder[i] - 1) / 2;
            }
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}