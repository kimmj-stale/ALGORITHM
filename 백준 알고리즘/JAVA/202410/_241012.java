/* 백준 5598 - 카이사르 암호
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String caesar_word = br.readLine();
        String ans = "";
        for (int i = 0; i < caesar_word.length(); i++) {
            char text = caesar_word.charAt(i);
            if (text >= 68) text -= 3;
            else text += 23;
            ans += text;
        }
        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */
