import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        bf.write("[안내]피보나치 수열 프로그램 시작.\n원하는 수열의 개수를 입력해 주세요 : ");
        bf.flush();

        int num = getUserInput();
        int[] fibonacci = getFibonacci(num);
        printNumbers(fibonacci);
    }
열
    static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int[] getFibonacci(int num) {
        int[] fibonacci = new int[num];

        if (num >= 1) { // num이 1 이상일 경우
            fibonacci[0] = 1;
        }

        if (num >= 2) { // num이 2 이상일 경우
            fibonacci[1] = 1;
        }

        for (int i = 2; i < num; i++) { // num이 3 이상일 경우
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    static void printNumbers(int[] fibonacci) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.write("[피보나치 수열 출력]\n");

        for (int num : fibonacci) {
            bf.write(num + "\n");
        }

        bf.write("[안내]프로그램을 종료합니다.");
        bf.flush();
    }
}
