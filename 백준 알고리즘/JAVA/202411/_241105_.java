/* 백준 2580 - 스도쿠
import java.io.*;

public class Main {
    static int[][] sudoku;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(list[j]);
            }
        }
        DFS();
    }

    static void DFS() throws IOException{
        //찾은 0값의 위치가 담긴 array를 별도로 담아준다.
        int[] table = findZero();
        //모든 0의 위치를 끝낸경우 = findZero() 연산이 끝난 경우 => 위치 인덱스 값은 table에 전달
        // findZero연산이 끝나면 null을 반환했으므로 if문 시작
        if (table == null) {
            printAns();
            bw.flush();
            bw.close();
            System.exit(0);
        }

        int x = table[0];
        int y = table[1];
        for (int i = 1; i < 10; i++) {
            if (search(x , y , i)) {
                sudoku[x][y] = i;
                DFS();
                sudoku[x][y] = 0;
            }
        }
    }
    //스도쿠 퍼즐의 규칙대로 가로 + 세로 + 3x3 박스에 겹치는 수 판별
    //이미 존재하는 값이면 false반환, 아니면 true로 반환
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
        return true;
    }
    //값이 있는 곳과 별개로 값이 0인 곳을 따로 찾아야 한다 -> 해당 값의 인덱스 값을 찾아야 하고
    static int[] findZero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    //해당 인덱스 값 하나씩 리턴
                    return new int[] {i , j};
                }
            }
        }
        //모든 인덱스 값이 리턴됐다면 null return
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

/*틀렸던 풀이
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;
    static boolean[] visited;
    static ArrayList<int[]> zero_Table;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        sudoku = new int[9][9];
        zero_Table = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(list[j]);;
                if (sudoku[i][j] == 0) zero_Table.add(new int[] {i , j});
            }
        }

        DFS(0);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void DFS(int depth) {
        visited = new boolean[10];

        if (zero_Table.size() == depth) {
            print();
            System.exit(0);
        }

        int x = zero_Table.get(depth)[0];
        int y = zero_Table.get(depth)[1];


        for (int i = 0; i < 9; i++) {
            if (sudoku[x][i] != 0) visited[sudoku[x][i]] = true;
        }
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] != 0) visited[sudoku[i][y]] = true;
        }

        int st_x = (x / 3) * 3;
        int st_y = (y / 3) * 3;
        for (int i = st_x; i < st_x + 3; i++) {
            for (int j = st_y; j < st_y + 3; j++) {
                if (sudoku[i][j] != 0) visited[sudoku[i][j]] = true;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (!visited[i]) {
                sudoku[x][y] = i;
                DFS(depth + 1);
                sudoku[x][y] = 0;
            }
        }
    }
    static void print() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */