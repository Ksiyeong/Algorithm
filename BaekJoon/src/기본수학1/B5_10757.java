package 기본수학1;

import java.util.Scanner;
import java.util.Stack;

public class B5_10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String A = str.split(" ")[0];
        Stack<Integer> stackA = new Stack<>();
        for (String i : A.split("")) {
            stackA.push(Integer.parseInt(i));
        }

        String B = str.split(" ")[1];
        Stack<Integer> stackB = new Stack<>();
        for (String i : B.split("")) {
            stackB.push(Integer.parseInt(i));
        }

        int[] resultArr = new int[A.length() > B.length() ? A.length() + 1 : B.length() + 1];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] += (stackA.size() != 0 ? stackA.pop() : 0) + (stackB.size() != 0 ? stackB.pop() : 0);
        }

        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] >= 10) {
                resultArr[i] -= 10;
                resultArr[i + 1] += 1;
            }
        }

        int len = resultArr[resultArr.length - 1] == 0 ? resultArr.length - 2 : resultArr.length - 1;

        String result = "";
        for (int i = len; i >= 0; i--) {
            result += resultArr[i];
        }
        System.out.println(result);
    }
}