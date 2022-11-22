package 기본수학2;

import java.util.Scanner;

public class S2_9020 {

    static int[] primeArr; // 소수를 담을 배열 생성

    public static void main(String[] args) {
        //TODO: 골드바흐 수를 출력하라
        //TODO: 여러개일 경우 두수의 차가 가장 작은 값을 출력하라
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 테스트케이스 갯수
        int[] nArr = new int[T]; // 테스트케이스 n을 담을 배열
        int maxN = 0; // n중 최대값을 구하기 위한 변수

        for (int i = 0; i < T; i++) {
            nArr[i] = Integer.parseInt(sc.nextLine()); // nArr에 n값을 넣어주고
            if (maxN < nArr[i]) maxN = nArr[i]; // 최대값을 구한다
        }

        primeArr = new int[maxN + 1]; // 소수를 담을 배열의 크기 설정(최대값을 기준으로 생성)

        for (int i = 2; i < primeArr.length; i++) { // 2부터 최대값까지의 모든 수를 넣어준다
            primeArr[i] = i;
        }

        for (int i = 2; i < primeArr.length; i++) { // 에라토스테네스의 체를 이용하여 소수를 담아준다
            for (int j = i * 2; j < primeArr.length; j += i) {
                primeArr[j] = 0;
            }
        }

        for (int n : nArr) { // n들을 하나씩 가져와서 골드바흐 수를 구해준다
            for (int i = n / 2; i < n; i += 1) { // 중간부터 검사하면 두수의 차가 가장 작기 때문에 중간부터 검사
                if (primeArr[i] != 0 && primeArr[n - i] != 0) { // 현재 i값이 골드바흐 수인지 검사한다
                    System.out.println(n - i + " " + i);
                    break;
                }
            }
        }
    }
}
