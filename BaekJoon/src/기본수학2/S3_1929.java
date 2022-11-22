package 기본수학2;

import java.io.*;

public class S3_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bw.readLine();

        int M = Integer.parseInt(input.split(" ")[0]); // 작은수
        int N = Integer.parseInt(input.split(" ")[1]); // 큰수

        // arr에 N이하의 숫자들을 담아준다
        int[] arr = new int[N + 1];
        for (int i = 2; i < N + 1; i++) {
            arr[i] = i;
        }

        // 에라토스테네스의 체를 이용하여 합성수들을 모두 0으로 만든다
        for (int i = 2; i < N + 1; i++) {
            for (int j = i * 2; j < N + 1; j += i) {
                arr[j] = 0;
            }
        }

        // M이상의 수들을 모두 출력한다 -> 합성수들을 모두 0으로 만들었기 때문에 M이상의 수는 모두 소수이다
        for (int prime : arr) {
            if (prime >= M) bf.write(prime + "\n");
        }
        bf.flush();
    }
}

// 재귀로 푼거
//public class S3_1929 {
//    public static void main(String[] args) {
//        //TODO: 에라토스테네스의 체를 사용해보자
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        int M = Integer.parseInt(input.split(" ")[0]); // 작은수
//        int N = Integer.parseInt(input.split(" ")[1]); // 큰수
//
//        // ArrayList에 2부터 N까지의 정수를 넣어준다
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 2; i <= N; i++) {
//            list.add(i);
//        }
//
//        ArrayList<Integer> primeList = primeMaker(list.get(0), list);
//
//        primeList.removeIf(i -> (i < M));
//
//        for (int i : primeList) {
//            System.out.println(i);
//        }
//    }
//
//    // TODO: 재귀 말고 새로운 방법 강구 -> 시간초과
//    static public ArrayList<Integer> primeMaker(int prime, ArrayList<Integer> primeList) {
//
//        if (primeList.get(primeList.size() - 1) == prime) return primeList;
//
//        int nowIndex = primeList.indexOf(prime) + 1;
//
//        for (int i = nowIndex; i < primeList.size(); i++) {
//            if (primeList.get(i) % prime == 0) {
//                primeList.remove(i);
//                i -= 1;
//            }
//        }
//        return primeMaker(primeList.get(nowIndex), primeList);
//    }
//}

