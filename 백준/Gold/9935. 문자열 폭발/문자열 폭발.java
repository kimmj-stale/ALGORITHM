import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();
        //폭발 문자
        String B_word = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            //stack에 단어 저장
            stack.push(word.charAt(i));
            //stack에 폭발 문자의 길이만큼 들어가 있지 않다면 넘어감
            if (stack.size() >= B_word.length()) {
                //폭발 문자가 들어있는 경우 판별하기 위한 flag
                Boolean flag = true;
                for (int j = 0; j < B_word.length(); j++) {
                    //stack에 저장된 문자와 폭발 문자 비교
                    //폭발 문자가 들어있는 경우 pop을 통해 제거
                        //스택은 선입후출이기 때문에  길이가 폭발 문자와 같을 때 부터 전체 문자의 길이까지 검증 가능하다.
                    if (stack.get(stack.size() - B_word.length() + j) != B_word.charAt(j)) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    for (int j = 0; j < B_word.length(); j++) {
                        stack.pop();
                    }
                }
            }

        }
        if (stack.isEmpty()) bw.write("FRULA");
        else {
            for (Character c : stack) {
                sb.append(c);
            }
            sb.append("\n");
            bw.write(sb + "");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}