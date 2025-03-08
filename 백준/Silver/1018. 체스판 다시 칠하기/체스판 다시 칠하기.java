import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        char arr[][] = new char[column][row];
        String ans1 = "WBWBWBWB";
        String ans2 = "BWBWBWBW";
        int max_count = 33;
        int r_count = 0;
        for (int i = 0; i < column; i++) {
            String s = sc.next();
            for (int j = 0; j < row; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for (int p = 0; p < column - 7; p++) {
            for (int i = 0; i < row - 7; i++) {
                //count값 초기화
                int count1 = 0;
                int count2 = 0;
                //8 * 8 칸의 잘못 칠해진 칸의 갯수 구하기
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 8; k++) {
                        if (j % 2 == 0) {

                            if (arr[p + j][i + k] != ans1.charAt(k)) {
                                count1++;
                            }

                            if (arr[p + j][i + k] != ans2.charAt(k)) {
                                count2++;
                            }

                        } else {

                            if (arr[p + j][i + k] != ans1.charAt(k)) {
                                count2++;
                            }

                            if (arr[p + j][i + k] != ans2.charAt(k)) {
                                count1++;
                            }

                        }
                    }
                }

                //두 가지 경우의 수 중 작은 값 선택하는 알고리즘
                if (count2 >= count1) {
                    r_count = count1;
                }
                else {
                    r_count = count2;
                }

                //최솟값 구하기
                if (max_count >= r_count) {
                    max_count = r_count;
                }
            }
        }
        System.out.println(max_count);
    }
}