//스택의 길이가 1_000_000 이 최대이므로 탐색을 한 번만 가능하도록 설계해야 한다. - O(n)
//전체 탐색을 진행하면서 풀이한 방식은 O(n^2)번 이었다.
//스택을 수를 저장하지 않고 인덱스 정보를 담는 배열로 사용하면 한 번만 탐색이 가능해졌다.

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        //오큰값을 저장할 배열
        int[] ans = new int[n];
        //전체 수 들을 저장할 배열
        int[] table = new int[n];
        //인덱스 정보를 저장할 스택
        Stack<Integer> stack = new Stack<>();
        //table의 한 값을 지정
            //그 값이 오큰수인 모든 값들을 저장
            //그 수들의 위치를 pop() 을 통해 제거
                //오큰수를 저장하지 못한 수들은 다음 오큰수를 구할 때 까지 stack에 저장되게 됨
                //오큰수가 정해지면 stack에서 빠지고 다음 오큰수를 구해야 하는 수의 후보의 인덱스 값이 저장됨
            //끝까지 정해지지 않았다면 해당 인덱스 위치에 -1 값을 저장시킴
        stack.add(0);
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && table[stack.peek()] < table[i]) {
                ans[stack.pop()] = table[i];
            }
            //이 인덱스에 해당하는 값은 비교를 위해 사용되었고 오큰수를 정하지 않았으므로 다음에 구할 인덱스이다.
            //따라서 해당 스택에 저장
            stack.add(i);
        }

        //위 연산이 끝나면 오큰수를 구할 수 있는 인덱스들을 모두 처리했을 것
        //하지만 오큰수를 구할 수 없었던 인덱스 값들은 남아 있고, 이 인덱스에 해당하는 값들은 모두 -1이다.
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        for (int i : ans) {
            bw.write(i + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}