/* 백준 2630 - 색종이 만들기 (재귀 + 분할)
//정사각형 갯수 구하기
//1은 파란색 , 0은 흰색 -> 가능한 최대 크기의 정사각형 갯수 구하기
//색종이 전체에 같은 색이 칠해지지 않았다? -> 4등분
//위를 반복

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , sum , blue , white;
    static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        search(0 , 0 , n);
        System.out.println(white + "\n" + blue);
    }
    static void search(int x , int y , int div) {
        sum = 0;
        for (int i = x; i < x + div; i++) {
            for (int j = y; j < y + div; j++) {
                sum += board[i][j];
            }
        }
        if (sum == div * div) blue++;
        else if (sum == 0) white++;
        else {
            div /= 2;

            search(x , y , div);
            search(x + div , y , div);
            search(x , y + div , div);
            search(x + div , y + div , div);
        }
    }
}
 */
