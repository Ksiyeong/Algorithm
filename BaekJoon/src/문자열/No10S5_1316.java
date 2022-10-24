package S6문자열;

import java.util.Scanner;

public class No10S5_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = n;

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("");
            String check = ""; // 사용된 알파벳을 받을 변수
            String beforeChar = ""; // 반복여부 확인을 위한 변수

            for (String s : arr) {
                if (!beforeChar.equals(s)) { // 새로운 알파벳 등장 시
                    beforeChar = s; // 새로운 알파벳으로 변경하고

                    if (check.contains(s)) { // 그룹단어로 지정됬는지 여부 확인
                        result -= 1; // true일 경우 이미 그룹단어로 사용된적 있으므로 그룹단어가 아니라는 뜻
                        break; // 해당문자 그룹단어 아니므로 다음 단어 검사하러 이동
                    } else {
                        check += s; //false일 경우 체크에 알파벳 추가
                    }
                }
            }
        }
        System.out.println(result);
    }
}
