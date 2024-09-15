/* 01타일 - 재귀
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] data_sheet;
    static long fibo(int n) {
        if (n == 1) return 1;
        if (data_sheet[n] != 0) return data_sheet[n];

        data_sheet[n] = fibo(n - 2) + fibo(n - 1);
        return data_sheet[n] % 15746;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        data_sheet = new long[n + 2];
        data_sheet[1] = 1;
        data_sheet[2] = 2;

        System.out.println(fibo(n));
    }
}
 */

/* padovan sequence (파도반 수열)
import java.io.*;

//1 1 1 2 2 3 4 5 7 9
//f(n) = f(n - 2) + f(n - 3)
public class Main {
    static long[] data_sheet;
    public static long padovan(int m) {
        if (data_sheet[m] != 0) return data_sheet[m];

        data_sheet[m] = padovan(m - 3) + padovan(m - 2);
        return data_sheet[m];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        data_sheet = new long[101];

        data_sheet[1] = 1;
        data_sheet[2] = 1;
        data_sheet[3] = 1;
        data_sheet[4] = 2;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            sb.append(padovan(m)).append("\n");
        }
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */