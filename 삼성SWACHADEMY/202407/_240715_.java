/* 1
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String ans;
        for (int i = 1; i <= n; i++) {
            Boolean pointer = true;
            String num = br.readLine();

            String year = num.substring(0 , 4);
            int month = Integer.parseInt(num.substring(4 , 6));
            int day = Integer.parseInt(num.substring(6 , 8));

            //예외 처리 구간
            switch (month) {
                case 1:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 2:
                    if (day < 1 || day > 28) pointer = false;
                    break;
                case 3:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 4:
                    if (day < 1 || day > 30) pointer = false;
                    break;
                case 5:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 6:
                    if (day < 1 || day > 30) pointer = false;
                    break;
                case 7:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 8:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 9:
                    if (day < 1 || day > 30) pointer = false;
                    break;
                case 10:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                case 11:
                    if (day < 1 || day > 30) pointer = false;
                    break;
                case 12:
                    if (day < 1 || day > 31) pointer = false;
                    break;
                default:
                    pointer = false;
                    break;
            }

            String s_month = "";
            String s_day = "";
            if (pointer == false) ans = "-1";
            else {
                if (month < 10) {
                    s_month = "0" + String.valueOf(month);
                }
                else s_month = String.valueOf(month);

                if (day < 10) {
                    s_day = "0" + String.valueOf(day);
                }
                else s_day = String.valueOf(day);
                ans = String.valueOf(year) + "/" + s_month + "/" + s_day;
            }
            System.out.print("#" + i + " ");
            System.out.println(ans);
        }
    }
}
 */
