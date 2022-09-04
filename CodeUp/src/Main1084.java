import java.io.*;
import java.util.StringTokenizer;

public class Main1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine()); // 버퍼리더.리드라인으로 줄단위로 읽어온 뒤 스트링토커나이저에 담는다

        int a = Integer.parseInt(input.nextToken()); // 순서대로 하나씩 꺼내다 씀.(사용한 토큰은 input에서 소멸
        int b = Integer.parseInt(input.nextToken());
        int c = Integer.parseInt(input.nextToken());

        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    count += 1;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}


