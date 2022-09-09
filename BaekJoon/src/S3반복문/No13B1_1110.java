package S3반복문;
import java.util.Scanner;

public class No13B1_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int subN = N; // 비교를 위한 N 맨 처음 비교때문에 필요
        int addN; // N의 각 자릿수를 더한 값
        int N1; // N, subN, newN의 1의 자리수
        int newN = -1; // 새롭게 생성된 N 디폴트값으로 -1을 준 이유는 N이 0일 때를 위해
        int count = 0;

        while (N != newN) {
            if (subN < 10) {
                N1 = subN;
                addN = subN;
            } else {
                N1 = subN % 10;
                addN = subN / 10 + N1;
            }
            newN = N1 * 10 + addN % 10;
            subN = newN;
            count += 1;
        }

        System.out.println(count);
    }
}
