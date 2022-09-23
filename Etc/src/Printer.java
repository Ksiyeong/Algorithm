import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int bufferSize = 3;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        Printer printer = new Printer();

        int output = printer.queuePrinter(bufferSize, capacities, documents);
        System.out.println(output);
    }

    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        // 버퍼사이즈만큼의 인쇄작업목록 생성
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < bufferSize; i++) {
            q.add(0);
        }
        // 문서 대기열을 큐로 변경
        Queue<Integer> qDocuments = new LinkedList<>();
        for (int i : documents) {
            qDocuments.add(i);
        }
        int second = 0;

        // 문서 대기열이 모두 비면 종료
        while (qDocuments.size() != 0) {
            second++;
            q.poll();

            // (인쇄 작업목록안의 용량 + 대기중인문서)가 최대 용량을 초과할 경우 0을 집어넣어 버퍼만 흐르게 한다
            if (q.stream().mapToInt(i -> i).sum() + qDocuments.peek() > capacities) {
                q.add(0);
            } else { // 용량이 충분할 경우 인쇄 시작
                q.add(qDocuments.poll());
            }
        }
        return second + bufferSize; // 문서 대기열이 0이 되고 버퍼사이즈 빠져나가기까지 걸리는 시간 계산
    }
}