/*1
import java.io.*;

public class Main {
    static int ans = 0;
    static int call;
    
    static int recursion(String s , int l , int r) {
        ans++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s , l + 1 , r - 1);
    }

    static int isPalindrome(String s) {
        return recursion(s , 0 , s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String word = br.readLine();
            sb.append(isPalindrome(word)).append(" ");
            sb.append(ans).append("\n");
            ans = 0;
        }
        bw.write(String.valueOf(sb));

        br.close();
        bw.flush();
        bw.close();
    }
}
 */
