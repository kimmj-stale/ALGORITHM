import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str , " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        
        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}