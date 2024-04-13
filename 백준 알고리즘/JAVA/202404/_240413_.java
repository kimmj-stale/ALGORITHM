/*1
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        //정렬 전 배열과 정렬 후 배열을 생성
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        //정렬된 배열에 번호를 매긴 후 저장할 Hash map 생성
        Map <Integer , Integer> map = new HashMap<>();

        //두 배열에 값을 저장
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr1[i] = value;
            arr2[i] = value;
        }
        //비교를 위해 arr2를 정렬
        Arrays.sort(arr2);

        //Hash array에 저장할 두 값 지정
        //arr2는 정렬되었기에 가장 작은 값이 0 , 가장 큰 값이 n으로 대응됨
        int rank = 0;
        for (int val1 : arr2) {
            if (!map.containsKey(val1)) {   //arr2의 data 값을 key 로써 저장시킴, value 는 rank
                map.put(val1 , rank);
                rank++;                 //  부여한 랭킹은 0부터 시작
            }
        }
        //Hash에 저장된 순서를 정렬되지 않은 배열 arr1의 값을 일대일 대응
        for (int val2 : arr1) {
            int ranked_num = map.get(val2);
            sb.append(ranked_num).append(" ");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
 */