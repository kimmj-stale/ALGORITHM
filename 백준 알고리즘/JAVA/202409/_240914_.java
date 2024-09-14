/* 01 타일
import java.io.*;

public class Main{
    public static long f[];
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        f = new long[n+2];
        System.out.println(fib(n));
    }

    // 2진 수열을 만드는데, 0은 홀수개 있을 수 없고 짝수개씩 붙어있을수만 있다.
    // 길이가 n인 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.
    // 결과를 보면 f=3부터 피보나치 수열로 나타난다는 것을 알 수 있다.
    public static long fib(int n) {
        f[1] = 1; // 1
        f[2] = 2; // 11, 00
        for (int i=3; i<=n; i++)
            f[i] = (f[i-1] + f[i-2])%15746;
        return f[n];
    }
}
 */