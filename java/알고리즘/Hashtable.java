/**
 * hash table
 * 해시는 key - value 끼리 대응하는 하나의 덩어리를 배열 형식으로 저장한 자료 구조 형태
 * key 를 input 으로 넣은면 value 를 output 으로 출력하는 형식
 * 해당 key 값을 고정된 길이의 hash 값으로 변경하는 과정을 hashing 이라고 하며 이는 hash 함수가 자동으로 이행한다.
 * hash 는 이들을 저장하는 장소로 생각하면 된다

 * 장점
 * hash 는 기본적으로 일대일 대칭 구조이기에 시간 복잡도가 O(1)이다.

 * 단점
 * 다른 key 값이 hashing 되어 같은 value 값을 도출해 내는 Hash 충돌이 발생할 수 있다.
 * 일반적으로 연속적이지 않은 key 값은 길이가 정해진 hash 의 공간낭비가 매우 심해지게 만든다. hashing 되지 않은 공간은 빈 채로 남아있는다.
 * 해시 함수 의존도가 높아 함수가 복잡해지면 hash 생성이 매우 오래걸린다.
 */

/* ex
*/
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
