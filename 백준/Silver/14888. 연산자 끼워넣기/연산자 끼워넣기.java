import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] table , operator;
    static int max , min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine() , " ");
        table = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine() , " ");
        operator = new int[4];
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        DFS(1 , table[0]);

        System.out.println(max);
        System.out.println(min);
    }
    static void DFS(int depth , int ans) {
        if (depth == n) {
            max = Math.max(max , ans);
            min = Math.min(min , ans);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] < 1) continue;
            operator[i]--;

            switch (i) {
                case 0:
                    DFS(depth + 1 , ans+table[depth]);
                    break;

                case 1:
                    DFS(depth + 1 , ans-table[depth]);
                    break;

                case 2:
                    DFS(depth + 1 , ans*table[depth]);
                    break;

                case 3:
                    DFS(depth + 1 , ans/table[depth]);
                    break;

                default:
                    break;
            }
            operator[i]++;
        }
    }
}