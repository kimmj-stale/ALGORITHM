/* 칸토어 집합 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n , len;
    static StringBuilder ans;

    static void cantor(int start , int size) {
        //size가 1인 경우 모든 경우를 완료한 경우 이므로 종료
        if (size == 1) return;
        //크기를 3으로 나눈 값을 구하여 공백이 시작되는 부분의 범위를 구할 수 있음
        int div_size = size / 3;

        //만일 , n = 2인 경우 len = 9이므로 처음 공백이 들어가는 범위는 3 ~ 5 (0부터 시작하므로 위치는 4번째 ~ 6번째)
        //그 다음으로 공백이 들어가는 범위는 div_size = 3이므로 1 ~ 1 (재귀함수를 이용해서 공백 생성)

        //setCharAt을 이용하여 위치에 맞는 곳에 공백 생성


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;for (int i = start + div_size; i < start + 2 * div_size; i++) {
        ans.setCharAt(i , ' ');
        }
//재귀함수를 이용하여 다음 범위의 공백을 생성
//3개로 구역을 나눴으므로 각각을 1 , 2 , 3이라 하자
//재귀 범위는 아직 공백이 생성되지 못한 1 , 공백이 생성된 2 , 공백이 생성되지 못한 3으로 구성
//재귀 함수는 1 , 3을 대상으로 함
cantor(start , div_size);
cantor(start + 2 * div_size , div_size);
    }
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    //EOF방식으로 입력받기
    //받을 문자열을 미리 설정 후 받은 값이 null인 경우를 제외하고 입력받기
    //null인 경우 입력 정료
    while ((input = br.readLine()) != null) {
        n = Integer.parseInt(input);
        len = (int) Math.pow(3 , n);

        ans = new StringBuilder();
        for (int i = 0; i < len; i++) {
            ans.append("-");
        }

        cantor(0 , len);
        System.out.println(ans);
    }
    br.close();
}
 */

/*2

 */