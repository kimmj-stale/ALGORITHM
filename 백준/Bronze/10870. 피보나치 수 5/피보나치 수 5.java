import java.io.*;

public class Main {
    static int n;
    static int[] fibo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        fibo = new int[21];

        fibo[0] = 0;
        fibo[1] = 1;

        if (n >= 2) recursion(2);

        bw.write(fibo[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void recursion(int idx) {
        if (idx == n + 1) return;
        fibo[idx] = fibo[idx - 1] + fibo[idx - 2];
        recursion(idx + 1);
    }
}