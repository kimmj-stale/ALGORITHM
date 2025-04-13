import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] table = new int[n];
        int[] cnt = new int[1000001];
        int[] ans = new int[n];

        //table에 각자 원소의 갯수 입력
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i < n; i++) {
            cnt[table[i]]++;
        }

        stack.add(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && cnt[table[stack.peek()]] < cnt[table[i]]) {
                ans[stack.pop()] = table[i];
            }
            stack.add(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        for (int an : ans) {
            bw.write(an + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}