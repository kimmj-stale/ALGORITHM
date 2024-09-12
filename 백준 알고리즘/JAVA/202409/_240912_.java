/* 재귀 - 신나는 함수 실행 / 복습
//함수를 재귀적으로 후출할 때 너무 많은 재귀를 하면 오버클럭이 발생
//함수 호출 횟수를 줄이는 과정을 통해 시간 복잡도를 줄인다.
//이미 알고 있는 함수값은 저장해 놓고 나중에 활용할 수 있도록 한다.
//함수 호출을 통해 알고있는 값 이외에 미리 값이 저장되어 버리면 계산 결과값과 알고있던 값의 충돌이 일어나면서 오류가 발생한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //값을 미리 저장할 배열 설정
    //20 이상의 값은 w(20 , 20 , 20)으로 귀결되므로 따로 저장할 필요가 없다.
    static int[][][] data_sheet = new int[21][21][21];
    //출력함수 미리 설정
    static void print_function(int a , int b , int c , int ans) {
        System.out.printf("w(%d, %d, %d) = %d" , a , b , c , ans);
    }

    static int recall_function(int a , int b , int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return data_sheet[20][20][20] = recall_function(20 , 20 , 20);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine() , " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            //탈출조건 설정
            if (a == -1 && b == -1 && c == -1) break;

            print_function(a , b , c , recall_function(a , b , c));
        }
    }
}
 */