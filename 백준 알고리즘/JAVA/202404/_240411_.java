/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , "\n");
            word[i] = st.nextToken();
        }

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });
        bw.write(word[0] + "\n");
        for (int i = 1; i < n; i++) {
            if (!word[i].equals(word[i - 1])) {
                bw.write(word[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] word = new String[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            word[i][0] = st.nextToken();
            word[i][1] = st.nextToken();
        }
        Arrays.sort(word, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(word[i][0] + " " + word[i][1] + "\n");
            bw.write(String.valueOf(sb));
        }
        bw.flush();
        bw.close();
    }
}
 */