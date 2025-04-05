import java.io.*;
import java.util.Stack;

//기본적인 로직 설명
//문자열이 주어지고 특정 문자열이 들어가면 해당 문자열을 삭제하고 출력
//이 특정 문자열을 폭발 문자열이라고 함
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //전체 문자열 입력
        String line = br.readLine();
        //폭발 문자열 입력
        String B_word = br.readLine();

        //특정 문자열을 저장할 배열 결정 , 이번 문제는 Stack 사용
            //stack 을 사용한 이유 : 선입 후출의 특징을 이용
                //전체 문자열을 하나씩 받다가 특정 문자열이 존재한다면 뒤에서부터 제거할 수 있기 때문
                //pop() 연산을 폭발 문자열의 길이만큼 반복하면 제거 가능
                //사실 Queue나 Deque도 상관없음
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            stack.add(line.charAt(i));
            //폭발 문자열의 길이가 현재까지 받은 stack의 크기보다 크다면 비교 자체가 무의미 하므로 고려하지 않는다.
            if (stack.size() >= B_word.length()) {
                //stack에 폭발 문자열이 들어갔는지 판별하는 flag
                //한 글자씩 비교하면서 같은 문자열이 들어있는 경우 false , 하나라도 틀린 경우 true
                boolean flag = true;
                for (int j = 0; j < B_word.length(); j++) {
                    if (stack.get(stack.size() - B_word.length() + j) != B_word.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                //폭발 문자열이 발견 됐다면 그 길이만큼 pop() 연산 반복
                if (flag) {
                    for (int j = 0; j < B_word.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        //문자열 폭발로 아무것도 없다면 FRULA 출력
        if (stack.isEmpty()) {
            sb.append("FRULA");
        } else {
            for (Character c : stack) {
                sb.append(c);
            }
            sb.append("\n");
        }

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
