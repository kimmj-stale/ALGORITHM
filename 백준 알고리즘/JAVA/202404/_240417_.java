/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //받을 data의 갯수
        int log_count = Integer.parseInt(br.readLine());
        //값을 받을 hash field 선언
        Map<String , Boolean> CommuteLog = new HashMap<>();
        //값 받기
        for (int i = 0; i < log_count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            String member = st.nextToken();
            String state = st.nextToken();
            //state 값이 enter 이면 true , 아니면 false
            if (state.equals("enter")) {
                CommuteLog.put(member , true);
            }
            else {
                CommuteLog.put(member , false);
            }
        }
        //값을 저장할 ans를 선언
        //CommuteLog의 key - value 한쌍을 받아올 Entry를 선언 후 CommuteLog에서 불러옴
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String , Boolean> entry : CommuteLog.entrySet()) {
            if (entry.getValue()) {
                ans.add(entry.getKey());
            }
        }
        //분류를 하되 역순으로 정렬 = 사전의 역순
        Collections.sort(ans , Collections.reverseOrder());

        for (String val : ans) {
            sb.append(val).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int collection_number = Integer.parseInt(st.nextToken());
        int prob = Integer.parseInt(st.nextToken());
        String[] arr_num = new String[collection_number + 1];
        Map<String , String> Collection = new HashMap<>();

        for (int i = 0; i < collection_number; i++) {
            String name = br.readLine();
            String  number = String.valueOf(i + 1);

            Collection.put(name , number);
            arr_num[i] = name;
        }

        for (int i = 0; i < prob; i++) {
            String val = br.readLine();

            if (Collection.containsKey(val)) {
                bw.write(Collection.get(val) + "\n");
            }
            else {
                bw.write(arr_num[Integer.parseInt(val) - 1] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
 */