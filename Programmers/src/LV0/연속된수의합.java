package LV0;

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(5, 15)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
    }

    static public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int a = total / num;

        int b = num / 2;

        int c = a - b;

        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                answer[i] = c + i + 1;
            } else {
                answer[i] = c + i;
            }
        }

        return answer;
    }
}
