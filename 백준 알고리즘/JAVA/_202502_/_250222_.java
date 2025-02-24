/* 백트래킹 - 스도쿠 2580
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS();
    }
    //깊이 탐색
    static void DFS() {
//        해당 칸이 0 이라면 해당 칸의 좌표 반환
        int[] arr = search_zero();
        //만일 해당 좌표가 더이상 없다면 -> 백트래킹 과정을 출력하고 종료
        //해당 과정은 재귀로 진행되기 때문에 함수 종료가 아닌 System.exit이 맞음
        if (arr == null) {
            printAns();
            System.exit(0);
        }

        int x = arr[0];
        int y = arr[1];
        //백트래킹 + 재귀로 처리
        for (int i = 1; i <= 9; i++) {
            if (search(i , x , y)) {
                sudoku[x][y] = i;
                DFS();
                sudoku[x][y] = 0;
            }
        }
    }

    //빈 칸의 x , y 좌표 리턴
    static int[] search_zero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) return new int[] {i , j};
            }
        } return null;
    }

    //column 체크 + row 체크 + 3x3 체크 과정
    //해당 과정에서 해당 값이 이미 존재한다면 해당 좌표에선 false 리턴 -> DFS 과정 실행 X
    static boolean search(int depth , int x , int y) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[x][i] == depth) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == depth) return false;
        }

        int use_x = (x / 3) * 3;
        int use_y = (y / 3) * 3;
        for (int i = use_x; i < use_x + 3; i++) {
            for (int j = use_y; j < use_y + 3; j++) {
                if (sudoku[i][j] == depth) return false;
            }
        } return true;
    }

    static void printAns() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */