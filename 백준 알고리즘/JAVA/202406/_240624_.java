/*채팅창 인사 이모티콘
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashMap<String , Integer> table = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String nickname = st.nextToken();
            if (nickname.equals("ENTER")) {
                table.clear();
            }
            else {
                if (!table.containsKey(nickname)) {
                    ans++;
                }
                else table.put(nickname , 0);
            }
            table.put(nickname , 0);
        }
        br.close();
        bw.write(ans + "");
        bw.flush();
        bw.close();
    }
}
 */
