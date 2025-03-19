import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

       int n = Integer.parseInt(br.readLine());
       int max = Integer.MIN_VALUE;
       int val = 0 , idx = 0;

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                val = Integer.parseInt(st.nextToken());
                if (max < val) {
                    max = val;
                    idx = i;
                }
            }
        }

        switch (idx) {
            case 1:
                bw.write("PROBRAIN");
                break;
            case 2:
                bw.write("GROW");
                break;
            case 3:
                bw.write("ARGOS");
                break;
            case 4:
                bw.write("ADMIN");
                break;
            case 5:
                bw.write("ANT");
                break;
            case 6:
                bw.write("MOTION");
                break;
            case 7:
                bw.write("SPG");
                break;
            case 8:
                bw.write("COMON");
                break;
            case 9:
                bw.write("ALMIGHTY");
                break;
            default:
                bw.write("");
                break;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}