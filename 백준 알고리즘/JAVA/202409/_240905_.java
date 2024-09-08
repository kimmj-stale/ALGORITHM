/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                int tempRow = x;
                int tempColumn = y;
                int tempN = n;

                if (tempRow%3 == 1 && tempColumn%3 == 1) {
                    sb.append(' ');
                } else {
                    while (true) {
                        tempRow %= tempN;
                        tempColumn %= tempN;

                        tempN /= 3;
                        if (tempRow < 3 || tempColumn < 3) {
                            sb.append('*');
                            break;
                        }

                        if ((tempN * 2 - 1 >= tempRow && tempRow >= tempN) && (tempN * 2 - 1 >= tempColumn && tempColumn >= tempN)) {
                            sb.append(" ");
                            break;
                        }
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
*/
