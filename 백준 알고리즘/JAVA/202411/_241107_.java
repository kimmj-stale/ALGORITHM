/* 백준 14888 - 연산자 끼워넣기
//값이 주어지고 연산자 갯수도 주어짐 -> 연산자는 index로 판별
//숫자 갯수는 2 ~ 11 , 연산자 갯수는 (숫자 갯수 - 1 , table 크기는 4)
//idx : 0 = + , 1 = - , 2 = * , 3 = /(몫)
//가능한 연산들 중에서 최댓값 && 최솟값 구현
//2
//5 6
//0 0 1 0

//30
//30

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , min , max;
    //숫자 테이블 & 연산자 테이블
    static int[] num , operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        num = new int[n];
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        operator = new int[4];
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        DFS(1 , num[0]);

        bw.write(max + "\n" + min);
        bw.flush();
        br.close();
        bw.close();
    }
    static void DFS(int depth , int fin_value) {
        if (depth == n) {
            max = Math.max(max , fin_value);
            min = Math.min(min , fin_value);
            return;
        }


        //연산자 조건을 실행
        for (int i = 0; i < 4; i++) {
            //해당 인덱스의 연산자 갯수가 0인 경우 다음 인덱스로 넘어감
            if (operator[i] < 1) continue;
            operator[i]--;

            switch (i) {
                case 0:
                    DFS(depth + 1 , fin_value + num[depth]);
                    break;
                case 1:
                    DFS(depth + 1 , fin_value - num[depth]);
                    break;
                case 2:
                    DFS(depth + 1 , fin_value * num[depth]);
                    break;
                case 3:
                    DFS(depth + 1 , fin_value / num[depth]);
                    break;
                default:
                    break;
            }
            //연산자 갯수 초기화(백트래킹)
            operator[i]++;
        }
    }
}
 */

/* sw expert 2043 - 서랍의 비밀번호
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int pw = Integer.parseInt(st.nextToken());
        int take_num = pw - Integer.parseInt(st.nextToken()) + 1;


        bw.write(take_num + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* sw expert 21425 - +=
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int t , a , b , n , ans_A , ans_B , cnt;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            sb.append(case_Check(a , b , n)).append("\n");
        }

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static int case_Check(int a , int b , int n) {
        cnt = 0;
        while (true) {
            ans_A = a;
            ans_B = b;

            if (ans_A < ans_B) ans_A += b;
            else ans_B += a;

            cnt++;
            if (ans_A > n || ans_B > n) break;
            a = ans_A;
            b = ans_B;
        }
        return cnt;
    }
}
 */

/* sw expert

 */

/*sw expert 1859 - 백만장자 프로젝트

 */