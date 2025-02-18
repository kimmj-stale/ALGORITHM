/*
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");
        int cnt = word.length;
        // 시간 복잡도 n + a
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
 */

/* 1316
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long ans = 1L;
        //함수를 n번 호출하는 것 보다 for문으로 팩토리얼 계산
        //시간 복잡도 n(최대 20)

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                ans *= i;
            }
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 10870
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] fibo = new int[21];
        fibo[0] = 0;
        fibo[1] = 1;

        //시간 복잡도 n + a
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        bw.write(fibo[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */