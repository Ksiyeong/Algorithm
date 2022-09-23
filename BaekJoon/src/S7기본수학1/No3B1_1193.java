package S7기본수학1;

import java.util.Scanner;

public class No3B1_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int limit = 1; // N값이 포함되어 있는 위치 중 최대값
        int size = 1; // limit 위치의 분자(분모)의 값 중 큰 수

        // 1 2 3 4 5 6 순으로 최대값이 커짐
        while (limit < N) { // N값의 위치 중 최대값을 뽑아낸다
            size++;
            limit += size;
        }

        int n; // 분자
        int d; // 분모

        if (size % 2 == 0) { // size가 짝수일경우
            n = size; // 분자가 큰수이다
            d = 1;
            for (int i = 0; i < limit - N; i++) { // 최대값과 N값의 차이만큼 반복
                n -= 1;
                d += 1;
            }
        } else { // size가 홀수일경우
            n = 1;
            d = size; // 분모가 큰수이다
            for (int i = 0; i < limit - N; i++) { // 최대값과 N값의 차이만큼 반복
                n += 1;
                d -= 1;
            }
        }
        System.out.println(n + "/" + d);
    }
}