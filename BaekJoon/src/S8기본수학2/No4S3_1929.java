package S8기본수학2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No4S3_1929 {
    public static void main(String[] args) {
        //TODO: 에라토스테네스의 체를 사용해보자
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int M = Integer.parseInt(input.split(" ")[0]); // 작은수
        int N = Integer.parseInt(input.split(" ")[1]); // 큰수

        // ArrayList에 2부터 N까지의 정수를 넣어준다
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            primeList.add(i);
        }



        System.out.println(prime(primeList.get(0),primeList));
    }

    static public ArrayList<Integer> prime(int prime, ArrayList<Integer> primeList) {
        if (primeList.get(primeList.size()-1)==prime) return primeList;

        for (int i = 1; i < primeList.size(); i++) {
            if (primeList.get(i) % prime == 0) {
                primeList.remove(i);
                i -= 1;
            }
        }
        return prime(primeList.get(0),primeList);
    }
}

