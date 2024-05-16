/*풍선 터트리기 - 개어려움
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        //풍선에 적힌 값 저장
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        //Linkedlist는 시간 초과, ArrayDeque 이 연산이 더 빠름
        //덱에 풍선 순서 저장
        Deque<Integer> table = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            table.offer(i);
        }

        while (table.size() > 1) {
            int value = table.pollFirst();
            int idx = data[value - 1];
            sb.append(value).append(" ");
            //음수 idx가 나온다면 , 해당 위치의 값을 앞에서 부터 뒤로 넘긴다.
            if (idx < 0) {
                while (idx < 0) {
                    idx++;
                    table.offerLast(table.pollFirst());
                }
            }
            //양수 idx가 나온다면 , 해당 위치의 값을 뒤에서 부터 앞으로 넘긴다.
            //먼저 idx--를 해주는 이유는 idx의 범위에 0이 포함되어 있기 때문이다.
            else {
                idx--;
                while (idx > 0) {
                    idx--;
                    table.offerFirst(table.pollLast());
                }
            }
        }
        //하나를 남겨 마지막에 " "를 추가하지 않기 위함이다.
        sb.append(table.peekLast());
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //type 갯수
        int n = Integer.parseInt(br.readLine());
        //type 선언
        StringTokenizer st1 = new StringTokenizer(br.readLine() , " ");
        //들어갈 데이터 선언
        StringTokenizer st2 = new StringTokenizer(br.readLine() , " ");
        //deque 선언
        Deque<Integer> table = new ArrayDeque<>();
        while (n-- > 0) {
            int num = Integer.parseInt(st2.nextToken());
            if (Integer.parseInt(st1.nextToken()) == 0) {
                table.offer(num);
            }
        }

        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine() , " ");
        while (n1-- > 0) {
            int num = Integer.parseInt(st3.nextToken());
            table.offerFirst(num);
            sb.append(table.pollLast()).append(" ");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */