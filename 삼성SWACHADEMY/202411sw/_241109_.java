/* 백준 14889 - 스타트와 링크 복습
//dfs재귀로 푸는건 맞음
//팀을 나누는 방식은 true / false로 나누는거 확인
//값을 더한 후 최솟값으로 저장하고 있는 것도 확인
//visited로 팀을 나눈 사람을 업데이트 하는것도 확인
//다 해줬잖아

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , min , team_Start , team_Link;
    static int[][] status;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //전체 인원 수
        n = Integer.parseInt(br.readLine());
        min = Integer.MAX_VALUE;
        status = new int[n][n];
        //팀원이 정해진 사람의 번호를 저장하는 배열
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                status[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(0 , 0);
        System.out.println(min);

    }
    static void DFS(int k , int depth) {
        if (depth == n/2) {
            //재귀시에 저장된 값 초기화 선언
            team_Start = 0;
            team_Link = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    //팀에 포함되었을 때 들어올 점수를 누적
                    //6명의 경우, 뽑힌 사람이 3명이므로 1 2 3이 뽑혔다면 12 , 23 , 13 을 모두 더해지는 과정
                    //1이 선택되면 2~6까지 여부 확인 + 팀인 사람들 점수 모두 더함
                    //visited는 1~6까지 true로 바뀌면서 변화를 준다
                    //n/2개만큼 visited = true를 생성
                    if (visited[i] && visited[j]) team_Start += status[i][j] + status[j][i];
                    else if (!visited[i] && !visited[j]) team_Link += status[i][j] + status[j][i];
                }
            }
            int sub = Math.abs(team_Start - team_Link);
            min = Math.min(min , sub);
            //min이 0인 경우 나올 수 있는 가장 최솟값이므로 0이면 그냥 종료
            if (min == 0) {
                System.out.println(0);
                System.exit(0);
            }
        } else {
            for (int i = k; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    DFS(i + 1 , depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
 */

/* sw expert 2029 - 몫과 나머지 출력
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , m1 , m2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            m1 = Integer.parseInt(st.nextToken());
            m2 = Integer.parseInt(st.nextToken());
            System.out.print("#" + (i + 1) + " ");
            System.out.println((m1 / m2) + " " + (m1 % m2));
        }
    }
}
 */

/* sw expert 2027 - 대각선 출력하기
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != j) sb.append("+");
                else sb.append("#");
            }
            sb.append("\n");
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
}
 */