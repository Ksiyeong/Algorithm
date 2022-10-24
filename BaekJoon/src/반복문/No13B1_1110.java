package S3반복문;
import java.util.Scanner;

public class No13B1_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int newN = N; // 새롭게 생성될 N
        int addN; // N의 각 자릿수를 더한 값
        int N1; // N(newN)의 1의 자리수
        int count = 0;

        do {
            N1 = newN % 10;
            addN = newN / 10 + N1;
            newN = N1 * 10 + addN % 10;
            count += 1;
        } while (N != newN);

        System.out.println(count);
    }
}
