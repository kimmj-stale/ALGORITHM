import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] table;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        table = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(line[j]);
            }
        }

        compress(0 , 0 , n);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void compress(int x , int y , int div) {
        int sum = 0;
        for (int i = x; i < x + div; i++) {
            for (int j = y; j < y + div; j++) {
                sum += table[i][j];
            }
        }

        if (sum == div * div) sb.append("1");
        else if (sum == 0) sb.append("0");
        else {
            //압축을 위해 구간을 나눠야 한다면 괄호를 더해야 한다.
            sb.append("(");
            div /= 2;
            //수를 담는 경우 순서도 중요해진다.
            compress(x , y , div);
            compress(x , y + div , div);
            compress(x + div , y , div);
            compress(x + div , y + div , div);
            sb.append(")");
        }
    }
}