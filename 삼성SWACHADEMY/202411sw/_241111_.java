/* sw expert 2007 - 패턴 마디의 길이
import java.io.*;

public class Main {
    static String line , word , curr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t ; i++) {
            line = br.readLine();
            for (int j = 2; j <= 10; j++) {
                if (Division_Line(j)) {
                    System.out.println("#" + (i + 1) + " " + j);
                    break;
                }
            }
        }
    }
    static boolean Division_Line(int val) {
        word = "";
        curr = "";
        boolean ans;

        word = line.substring(0 , val - 1);
        curr = line.substring(val , val + val - 1);
        ans = word.equals(curr);
        return ans;
    }
}
 */

/* sw expert 많은 문제들
import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int t = IntStream.rangeClosed(1 , n).sum();
        bw.write(t + "");
        bw.flush();
        bw.close();
    }
}
 */

/* sw expert 많은 문제들
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        divisor(n);
        bw.write( sb + "");
        bw.flush();
        br.close();
        bw.close();

    }
    static void divisor(int k) {
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                sb.append(i);
                if (i != k) sb.append(" ");
            }
        }
    }
}
 */

/* sw expert 많은 문제들
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(RCP(A , B));
        bw.flush();
        bw.close();
    }
    static String RCP(int A , int B) {
        if (A - B > 0) {
            if (A - B == 1) return "A";
            else if (A - B == 2) return "B";
        } else {
            if (B - A == 1) return "B";
            else if (B - A == 2) return "A";
        }
        return "";
    }
}
 */

/* sw expert 많은 문제들

 */

/* sw expert 많은 문제들

 */