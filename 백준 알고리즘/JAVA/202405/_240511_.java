/*1
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while (true) {
            Stack<Integer> table = new Stack<>();
            String p = br.readLine();
            boolean stp = true;
            if (p.equals(".")) {
                break;
            }
            String[] splitted = p.split("");
            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].equals("(")) {
                    table.push(1);
                }
                else if (splitted[i].equals("[")) {
                    table.push(2);
                }
                else if (splitted[i].equals(")")) {
                    if (!table.isEmpty()) {
                        if (table.peek() == 1) table.pop();
                        else {
                            stp = false;
                            break;
                        }
                    }
                    else {
                        stp = false;
                        break;
                    }
                }
                else if (splitted[i].equals("]")) {
                    if (!table.isEmpty()) {
                        if (table.peek() == 2) table.pop();
                        else {
                            stp = false;
                            break;
                        }
                    }
                    else {
                        stp = false;
                        break;
                    }
                }
            }
            if (!stp) sb.append("no").append("\n");
            else if (table.contains(1) || table.contains(2)) {
                sb.append("no").append("\n");
            }
            else {
                sb.append("yes").append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> table_left = new Stack<>();
        int cnt = 1;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        // 52413
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num != cnt) table_left.push(num);
            else cnt++;

            while (!table_left.isEmpty()) {
                if (table_left.peek() == cnt) {
                    table_left.pop();
                    cnt++;
                }
                else break;
            }
        }
        if (!table_left.isEmpty()) bw.write("Sad");
        else bw.write("Nice");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
