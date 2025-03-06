import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static long ans , sum;
    static long[] remainder;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine() , " ");
        sum = 0L;
        ans = 0L;
        //나머지의 갯수를 구하기 위한 배열
        remainder = new long[m];
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            //0 ~ i 까지의 나머지를 구할 수 있다, i ~ j 까지의 나머지를 얻는 것을 위한 값이다.
            long rest = sum % m;
            //0 ~ i 까지의 수열 합이 m 으로 나누어 떨어지는 경우
            if (rest == 0) {
                ans++;
            }
            //나머지가 rest 인 구간합 수열의 갯수를 저장
            remainder[(int) rest]++;
        }

        //연산의 기본 논리 -
        //구간 합 A 와 B 가 있다고 가정하면
        //(A + B) % m = ((A % m) * (B % m)) % m 이 성립한다.
        for (int i = 0; i < m; i++) {
            //다음 연산을 사용하는 이유
            //앞서 0 ~ i 까지의 구간 합을 구했는데 0 ~ i 중 두 수 a , b 를 구한다 가정
            //이는 a ~ b 의 구간 합을 구하는 것과 같다. 즉 , 0 ~ i 안에 존재하는 모든 부분 수열의 나머지를 구하는 것과 같다.
            //이를 이용하여 m으로 나누어 떨어지는 구간 합의 갯수를 구할 수 있다.
            ans += remainder[i] * (remainder[i] - 1) / 2;
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}