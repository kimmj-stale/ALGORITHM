/* 백준 10430 - 나머지
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() ,  " ");
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int ans_1 = (A + B) % C;
        int ans_2 = ((A % C) + (B % C)) % C;
        int ans_3 = (A * B) % C;
        int ans_4 = ((A % C) * (B % C)) % C;
        sb.append(ans_1 + "\n").append(ans_2 + "\n").append(ans_3 + "\n").append(ans_4 + "\n");
        bw.write(sb + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
 */

/* 백준 4375 - 1
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                int k = 1;
                int n = Integer.parseInt(br.readLine());
                for (int i = 1; ; i++) {
                    k %= n;
                    k = k * 10 + 1;
                    if (k == 1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
 */
