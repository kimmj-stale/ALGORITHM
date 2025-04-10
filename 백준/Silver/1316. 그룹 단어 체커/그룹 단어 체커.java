import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Character , Integer> wordChecker = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            wordChecker.put(word.charAt(0) , 0);
            for (int j = 1; j < word.length(); j++) {
                if (wordChecker.containsKey(word.charAt(j))) {
                    if (word.charAt(j - 1) != word.charAt(j)) {
                        cnt--;
                        break;
                    }
                }
                else wordChecker.put(word.charAt(j) , 0);
            }
            wordChecker.clear();
        }

        bw.write(cnt + "");
        bw.flush();
        br.close();
        bw.close();
    }
}