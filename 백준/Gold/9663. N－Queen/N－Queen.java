import java.io.*;

public class Main {
    static int n , ans , arr[];
    static boolean horizonCheck[] , LdiagonalCheck[] , RdiagonalCheck[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        horizonCheck = new boolean[n + 1];
        LdiagonalCheck = new boolean[2 * n + 1];
        RdiagonalCheck = new boolean[2 * n];

        setQueen(1);

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
    public static void setQueen(int k) {
        if (k > n) {
            ans++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (horizonCheck[i]) continue;
            if (RdiagonalCheck[k - i + n]) continue;
            if (LdiagonalCheck[k + i]) continue;

            horizonCheck[i] = true;
            RdiagonalCheck[k - i + n] = true;
            LdiagonalCheck[k + i] = true;

            setQueen(k + 1) ;

            horizonCheck[i] = false;
            RdiagonalCheck[k - i + n] = false;
            LdiagonalCheck[k+ i] = false;
        }
    }
}