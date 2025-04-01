import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        getGeo(n);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void getGeo(int n) {
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
        for (int i = n - 1; i >= 1; i--) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
    }
}