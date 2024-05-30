/*1
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , k;
    static int ansNum;
    static int current;
    static StringBuilder sb = new StringBuilder();

    static void merge_sort(int[] arr , int left , int right) {
        if (left < right) {
            //불필요하게 크게 잡힌 array의 크기를 줄이는 방법
            int mid = left + (right - left) / 2;
            merge_sort(arr , left , mid);
            merge_sort(arr , mid + 1 , right);
            merge(arr , left , mid , right);
        }
    }
    static void merge(int[] arr , int low , int mid , int high) {
        int[] sorted = new int[high - low + 1];
        int l = low;
        int r = mid + 1;
        //index를 맞추기 위해 idx = low로 잡았기 때문에 시간이 오래 걸린다.
        //딱 n개의 크기만큼 할당받은 배열 sorted를 사용
        int idx = 0;

        while (l <= mid && r <= high) {
            if (arr[l] <= arr[r]) sorted[idx++] = arr[l++];
            else sorted[idx++] = arr[r++];
        }

        if (l > mid) {
            while (r <= high) {
                sorted[idx++] = arr[r++];
            }
        }
        else {
            while (l <= mid) {
                sorted[idx++] = arr[l++];
            }
        }

        int tmp = 0;
        while (low <= high) {
            arr[low] = sorted[tmp];
            if (++current == k) ansNum = sorted[tmp];
            tmp++;
            low++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr , 0 , n - 1);
        if (current < k) sb.append(-1);
        else sb.append(ansNum);

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
 */