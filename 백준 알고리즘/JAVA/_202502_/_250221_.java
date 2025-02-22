/* 백트래킹 2580
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;
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

    static void DFS() {
        int[] arr = search_Zero();
        if (arr == null) {
            printAns();
            System.exit(0);
        }

        int x = arr[0];
        int y = arr[1];
        for (int i = 1; i <= 9; i++) {
            if (search(i , x , y)) {
                sudoku[x][y] = i;
                DFS();
                sudoku[x][y] = 0;
            }
        }
    }

    static boolean search(int n , int x , int y) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == n) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[x][i] == n) return false;
        }

        int use_x = (x / 3) * 3;
        int use_y = (y / 3) * 3;
        for (int i = use_x; i < use_x + 3; i++) {
            for (int j = use_y; j < use_y + 3; j++) {
                if (sudoku[i][j] == n) return false;
            }
        } return true;
    }

    static int[] search_Zero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) return new int[] {i , j};
            }
        }return null;
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

/* 15649
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //백트래킹을 위한 방문했던 숫자는 제외하기 위한 배역
        visited = new boolean[n];
        //숫자 저장을 위한 m 개의 배열
        arr = new int[m];

        //DFS 해설
        //방문했던 위치를 해제한다. -> 방문 위치에서 깊이 탐색을 진행한다. -> 재귀를 통해 다음 위치에서 방문 위치를 해제 + 깊이 탐색 -> 함수를 풀어가면서 방문 위치를 다시 false로 돌아간다.
        DFS(0);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    public static void DFS(int depth) {
        if (depth == m) {
            //깊이 탐색을 위한 depth 설정
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                //방문했던 위치 잠금 해제
                visited[i] = true;
                arr[depth] = i + 1;
                //재귀 호출
                DFS(depth + 1);
                //빙믄헸단 위치 다시 잠금
                visited[i] = false;
            }
        }
    }
}
 */
