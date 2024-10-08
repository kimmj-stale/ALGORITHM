/* 그리디 알고리즘 1
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        Main main = new Main();
        main.schedule_check();
    }
    static int[][] array;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public void schedule_check() throws IOException {
        try {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            int prev = 0;
            array = new int[n][2];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine() , " ");
                array[i][0] = Integer.parseInt(st.nextToken());
                array[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[1] == o2[1]) return o1[0] - o2[0];
                    return o1[1] - o2[1];
                }
            });

            for (int i = 0; i < n; i++) {
                int start = array[i][0];
                if (i == 0) {
                    prev = array[i][1];
                    ans++;
                }
                else {
                    if (prev <= start) {
                        prev = array[i][1];
                        ans++;
                    }
                }
            }
            bw.write(ans + "");
            bw.flush();
            br.close();
            bw.close();

        }catch (Exception e){
        }
    }
}
 */
