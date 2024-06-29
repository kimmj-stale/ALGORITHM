/*1
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashMap<String , Integer> table = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String nick1 = st.nextToken();
            String nick2 = st.nextToken();

            if (!table.containsKey(nick1)) table.put(nick1 , 0);
            if (!table.containsKey(nick2)) table.put(nick2 , 0);

            if (nick1.equals("ChongChong") || nick2.equals("ChongChong")) {
                table.replace(nick1 , 0 , 1);
                table.replace(nick2 , 0 , 1);
            }

            if (table.get(nick1) == 1 && table.get(nick2) != 1) {
                table.replace(nick2 , 0 , 1);
            }
            else if (table.get(nick2) == 1 && table.get(nick1) != 1) {
                table.replace(nick1 , 0 , 1);
            }
        }

        for (int val : table.values()) {
            ans += val;
        }

        bw.write(ans + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
