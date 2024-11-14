/* 백준 1541 - 잃어버린 괄호(그리디 알고리즘)
//그리디 알고리즘 - 값을 더하는 순서를 정해 식의 결괏값이 최소가 되도록 한다.
//brute-force로 전체 탐색해서 값의 최솟값을 정한다.
//연산은 + , -밖에 없다.
//숫자의 자릿수는 최대 5자리이다.
//식의 길이는 최대 50자리다
//수의 시작값은 0일 수 있다. (0009 = 9)

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//-로 먼저 나눈 후 덧셈 연산을 처리(큰 수로 뺄 수 있도록 처리)
public class Main {
    static long ans;
    static int sum;
    static String line;
    static String[] div_sub , div_add;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        line = br.readLine();
        div_sub = line.split("-");
        for (String a : div_sub) {
            sum = 0;
            div_add = a.split("\\+");
            for (String b : div_add) {
                sum += Integer.parseInt(b);
            }
            list.add(sum);
        }

        ans = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ans -= list.get(i);
        }

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 백준 13305 - 주유소 (그리디 알고리즘 , 다시 한번 풀어보기)
import java.io.*;
import java.util.StringTokenizer;

//각 도시마다 기름 값이 원 안의 숫자로 제공됨
//1km 당 1L의 기름이 필요함
//무조건 완쪽에서 오른쪽으로 이동
//마지막 도시까지 가는 최소 비용을 구하시오
public class Main {
    static int n;
    static long min , sum , ans;
    static long[] road , cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine() , " ");
        road = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            //받는 값은 long 형으로 받을 필요가 없음
            road[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine() , " ");
        cost = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            //받는 값은 long 형으로 받을 필요가 없음
            cost[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(find_min_value() + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static long find_min_value() {
        min = Long.MAX_VALUE;
        sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (cost[i] >= min) {
                sum += min * road[i];
            } else {
                min = cost[i];
                sum += min * road[i];
            }
        }
        return sum;
    }
}
 */