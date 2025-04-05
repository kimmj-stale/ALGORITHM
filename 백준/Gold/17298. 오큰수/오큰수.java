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
        //전체 수들을 저장할 배열
        int[] arr = new int[n];
        //오큰수들을 저장할 배열
        int[] ans = new int[n];
        //각 정답들의 인덱스 값을 저장할 배열
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //핵심 로직 정리
        //이 연산은 " 오큰값 만을 구하는 " 로직
        //각 값을 배열을 순회하면서 오큰값을 구하면 시간 복잡도는 대략 O(n^2)가 된다.
            //따라서 배열을 한 번만 순회하는 것이 중요
        //오큰수의 후보가 되는 한 값을 지정 , 그 값의 비교를 진행
            //해당 값의 오큰수는 구하지 못했으므로 해당 값의 인덱스 값을 스택에 저장
        //해당 값을 오큰수로 가지는 수들을 모두 구한다.
            //다른 값과 비교할 필요가 없는게 인덱스 0부터 시작하여 구하기 때문에 놓치는 경우는 일어나지 않는다.
        //다음 오큰수 후보를 지정하면 아까의 오큰수 후보와 오큰수가 구해지지 않은 인덱스들이 스택에 저장되어 있어 오큰수를 구할 수 있다.
        //해당 과정을 오큰수가 모두 구해지도록 반복

        //초기값 설정 , 초기 오큰수 후보는 arr[0] 다음 값인 arr[1]이다.
        stack.add(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                //정답 배열에 저장
                ans[stack.pop()] = arr[i];
            }
            //오큰수를 구하지 못한 오큰수 후보의 인덱스 값 저장
            stack.add(i);
        }

        //끝까지 오큰수를 구하지 못한 수들은 오큰수가 없는 값이므로 -1 저장
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        for (Integer i : ans) {
            bw.write(i + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
