/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Case #" + i + ": " + sum);
        }
    }
}
 */

/*3
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }
    }
}
 */

/*4
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*5
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*6 - (EOF Error 문제)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str , " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
 */

/*7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int org_num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == org_num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
 */

/*8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int array[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] < x) {
                count++;
            }
        }
        int num =0;
        for (int i = 0; i < n; i++) {
            if (array[i] < x) {
                System.out.print(array[i]);
                num++;
                if (num == count) {
                    break;
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
 */

/*9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_num = -1000001;
        int min_num = 1000001;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a >= max_num) {
                max_num = a;
            }
            if (a <= min_num) {
                min_num = a;
            }
        }
        System.out.println(min_num + " " + max_num);
    }
}
 */

/*10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_num = 0;
        int n_index = 0;
        for (int i = 1; i <= 9; i++) {
            int a = sc.nextInt();
            if (max_num < a) {
                max_num = a;
                n_index = i;
            }
        }
        System.out.println(max_num);
        System.out.println(n_index);
    }
}
 */