/* 2941 - 크로아티아 알파벡
//이렇게 계속 string 관련 메서드를 아는지 물어본다.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int len = line.length();

        for (int i = line.length() - 1; i >= 1; i--) {
            if (line.charAt(i) == '=' || line.charAt(i) == '-') {
                if (i >= 2 && (line.charAt(i - 1) == 'c' || line.charAt(i - 1) == 's')) len--;
                else if (i >= 2 && line.charAt(i - 1) == 'z') {
                    if (line.charAt(i - 2) == 'd') len -= 2;
                    else len--;
                } else len--;

            } else if (line.charAt(i) == 'j') {
                if ((line.charAt(i - 1) == 'l' || line.charAt(i - 1) == 'n')) len--;
            }
        }

        bw.write(len + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 피보나치 수열
//재귀 풀이
import java.io.*;

public class Main {
    static int n;
    static int[] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        table = new int[21];

        table[0] = 0;
        table[1] = 1;

        if (n >= 2) fibo(2);

        bw.write(table[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }

    private static void fibo(int k) {
        if (k == n + 1) return;
        table[k] = table[k - 1] + table[k - 2];
        fibo(k + 1);
    }
}

//일반 반복문
import java.io.*;

public class Main {
    static int n;
    static int[] fibo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        fibo = new int[21];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 0; i < n - 1; i++) {
            fibo[i + 2] = fibo[i] + fibo[i + 1];
        }

        bw.write(fibo[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 11718
//버퍼 사용하기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";

        while ((line = br.readLine()) != null) {
            bw.write(line + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

// default reader 쓰기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println(word);
        }
        sc.close();
    }
}
 */

/* 1316
//hashmap 풀이
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
 */

/* 25206
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
        String ans = String.format("%.6f" , sum / div);
        System.out.println(ans);
    }
}
 */