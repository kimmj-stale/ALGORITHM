/* 1
import java.io.*;
import java.util.*;

public class Main {
    static int find_mode(int[] array) {
        int max_num = 0;
        List<Integer> md = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (array[i] > max_num) max_num = array[i];
        }
        for (int i = 0; i < 8001; i++) {
            if (max_num == array[i]) md.add(i - 4000);
        }

        if (md.size() == 1) return md.get(0);
        else {
            Collections.sort(md);
            return md.get(1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        int[] table = new int[n];
        int[] array = new int[8001];

        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(br.readLine());
            sum += table[i];
            array[table[i] + 4000]++;
        }

        br.close();
        //avg
        bw.write(Math.round(sum / n) + "\n");

        //middle
        Arrays.sort(table);
        bw.write(table[n / 2] + "\n");

        //mode
        bw.write(find_mode(array) + "\n");

        //range
        bw.write(table[n - 1] - table[0] + "");

        bw.flush();
        bw.close();
    }
}
 */