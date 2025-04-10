import java.io.*;

public class Main {
    static int n;
    static int[] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        table = new int[21];

        table[0] = 0;
        table[1] = 1;

        if (n >= 2) fibo(2);

        bw.write(table[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }

    private static void fibo(int k) {
        if (k == n + 1) return;
        table[k] = table[k - 1] + table[k - 2];
        fibo(k + 1);
    }
}