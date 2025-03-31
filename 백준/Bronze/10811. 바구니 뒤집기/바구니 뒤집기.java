import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int box[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            box[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                box[a] = box[b];
            }
            else if ((b - a) % 2 == 0) {
                for (int j = 0; j < (b - a) / 2; j++) {
                    int org_a = box[a + j];
                    box[a + j] = box[b - j];
                    box[b - j] = org_a;
                }
            }
            else {
                for (int k = 0; k < ((b - a + 1) / 2); k++) {
                    int org_a = box[a + k];
                    box[a + k] = box[b - k];
                    box[b - k] = org_a;
                }
            }
        }
        System.out.print(box[1]);
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + box[i]);
        }
    }
}