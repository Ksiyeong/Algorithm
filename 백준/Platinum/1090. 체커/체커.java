import java.io.*;
import java.util.Arrays;

public class Main {

    public static int[] solution(int[][] locations) {
        int[] answer = new int[locations.length]; // 모일 인원별로 값을 저장할 배열
        for (int i = 0; i < locations.length; i++) {
            answer[i] = Integer.MAX_VALUE;
        }

        for (int[] xLocation : locations) { // x 좌표 후보
            for (int[] yLocation : locations) { // y좌표 후보
                int[] costs = new int[locations.length]; // x,y 좌표와 입력받은 좌표의 거리를 비교한 값을 costs 에 입력
                for (int i = 0; i < locations.length; i++) {
                    costs[i] = Math.abs(xLocation[0] - locations[i][0]) + Math.abs(yLocation[1] - locations[i][1]);
                }

                Arrays.sort(costs); // 오름차순으로 정렬
                int cost = 0;
                for (int i = 0; i < locations.length; i++) {
                    cost += costs[i]; // cost에 순차적으로 더 하면서
                    answer[i] = Math.min(cost, answer[i]); // 해당 인덱스의 값(answer[i])와 현재 좌표의 거리(cost)와 비교하여 작은 값을 저장
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] locations = new int[n][2];

        for (int i = 0; i < locations.length; i++) {
            String[] str = br.readLine().split(" ");
            locations[i][0] = Integer.parseInt(str[0]);
            locations[i][1] = Integer.parseInt(str[1]);
        }

        int[] costs = solution(locations);
        for (int cost : costs) {
            bw.write(cost + " ");
        }
        bw.flush();
        bw.close();
    }
}