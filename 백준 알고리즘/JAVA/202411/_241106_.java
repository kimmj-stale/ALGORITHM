/* 백준 2580 - 스도쿠 복습
import java.io.*;

public class Main {
    //스도쿠 퍼즐
    static int[][] sudoku;
    //
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(list[j]);
            }
        }

        DFS();
        br.close();
    }
    static void DFS() throws IOException{
        int[] table = findZero();
        if (table == null) {
            printAns();
            bw.flush();
            bw.close();
            System.exit(0);
        }
        //findZero로 부터 받은 index i , i = x , y
        int x = table[0];
        int y = table[1];
        for (int i = 1; i < 10; i++) {
            if (search(x , y , i)) {
                sudoku[x][y] = i;
                DFS();
                //중복되는 경우 0으로 백트래킹
                sudoku[x][y] = 0;
            }
        }
    }
    //가로 & 세로 & 3x3박스의 중복 여부를 확인하는 함수
    //해당 값(n)이 있다면 false를 리턴하는 함수
    static boolean search(int x , int y , int n) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[x][i] == n) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == n) return false;
        }

        int start_x = (x / 3) * 3;
        int start_y = (y / 3) * 3;
        for (int i = start_x; i < start_x + 3; i++) {
            for (int j = start_y; j < start_y + 3; j++) {
                if (sudoku[i][j] == n) return false;
            }
        }
        //모두 아니면 true 반환
        return true;
    }
    //값이 0인 곳의 위치를 저장하는 함수
    //0인 곳을 모두 찾으면 null을 반환해 끝을 알리는 함수
    static int[] findZero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //0이 존재하는 위치 인덱스(i , j)
                if (sudoku[i][j] == 0) return new int[] {i , j};
            }
        }
        return null;
    }

    static void printAns() throws IOException{
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(sudoku[i][j] + " ");
            }
            bw.write("\n");
        }
    }
}
 */