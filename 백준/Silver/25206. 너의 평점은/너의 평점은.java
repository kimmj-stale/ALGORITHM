import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sum = 0;
        double scholar = 0;
        double div = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            String s = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String col = st.nextToken();
            div += score;
            if (col.equals("A+")) {
                scholar = 4.5;
            }else if (col.equals("A0")) {
                scholar = 4.0;
            }else if (col.equals("B+")) {
                scholar = 3.5;
            }else if (col.equals("B0")) {
                scholar = 3.0;
            }else if (col.equals("C+")) {
                scholar = 2.5;
            }else if (col.equals("C0")) {
                scholar = 2.0;
            }else if (col.equals("D+")) {
                scholar = 1.5;
            }else if (col.equals("D0")) {
                scholar = 1.0;
            }else if (col.equals("F")) {
                scholar = 0;
            }else if (col.equals("P")) {
                scholar = 0;
                div -= score;
            }
            sum += scholar * score;
        }
        System.out.println(sum / div);
    }
}
