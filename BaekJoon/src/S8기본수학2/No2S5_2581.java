package S8기본수학2;

import java.util.ArrayList;
import java.util.Scanner;

public class No2S5_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();// 작은 수
        if (M==1) M = 2;
        int N = sc.nextInt(); // 큰 수

        ArrayList<Integer> arr = new ArrayList<>();

        while (M <= N) {
            arr.add(M);
            for (int i = 2; i < M; i++) {
                if (M % i == 0) {
                    arr.remove(Integer.valueOf(M));
                    break;
                }
            }
            M++;
        }

        if (arr.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr.stream().mapToInt(i -> i).sum());
            System.out.println(arr.get(0));
        }
    }
}