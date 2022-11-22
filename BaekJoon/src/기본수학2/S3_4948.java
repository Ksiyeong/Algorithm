package 기본수학2;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class S3_4948 {
    static int[] primeArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            nList.add(n);
            n = Integer.parseInt(sc.nextLine());
        }

        int max = 2 * nList.stream()
                .mapToInt(i -> i)
                .max()
                .orElseThrow(NoSuchElementException::new);

        primeArr = new int[max + 1];
        for (int i = 2; i < primeArr.length; i++) {
            primeArr[i] = i;
        }

        for (int i = 2; i < primeArr.length; i++) {
            for (int j = i * 2; j < primeArr.length; j += i) {
                primeArr[j] = 0;
            }
        }

        for (int num : nList) {
            int count = 0;
            for (int i = num + 1; i <= num * 2; i++) {
                count += primeArr[i] != 0 ? 1 : 0;
            }
            System.out.println(count);
        }
    }
}
