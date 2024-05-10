/* Stack 예제1
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> table = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                table.push(num);
            }
            else {
                table.pop();
            }
        }

        int ans = 0;
        if (table.isEmpty()) {
            sb.append(0).append("\n");
        }
        else {
            for (int i = 0; i < table.size(); i++) {
                ans += table.elementAt(i);
            }
            sb.append(ans).append("\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2 Stack 예제 2
import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Integer> table = new Stack<>();
            String p = br.readLine();
            boolean ans = true;
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '(') {
                    table.push(1);
                }
                else {
                    if (table.isEmpty()) {
                        ans = false;
                        break;
                    }
                    table.pop();
                }
            }
            if (ans) {
                if (table.isEmpty()) {
                    sb.append("YES").append("\n");
                }
                else {
                    sb.append("NO").append("\n");
                }
            }
            else {
                sb.append("NO").append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */