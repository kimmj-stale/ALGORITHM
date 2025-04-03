import java.io.*;

public class Main {
    static long ans = 1L;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        if (n <= 1) ans = 1;
        else recursion(2);

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
    //재귀 문제니까 재귀로 풀자
    static void recursion(int k) {
        if (n + 1 == k) return;
        ans *= k;
        recursion(k + 1);
    }
}