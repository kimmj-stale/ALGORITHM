import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");
        int cnt = word.length;
        for (int i = word.length - 1; i >= 1; i--) {
            if (word[i].equals("-") || word[i].equals("=")) {
                cnt--;
                if (i >= 2 && word[i - 1].equals("z") && word[i - 2].equals("d")) cnt--;
            } else if (word[i].equals("j")) {
                if (word[i - 1].equals("n") || word[i - 1].equals("l")) cnt--;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        br.close();
        bw.close();
    }
}