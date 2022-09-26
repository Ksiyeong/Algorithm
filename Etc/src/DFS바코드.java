import java.util.Arrays;
import java.util.Stack;

public class DFS바코드 {
    public static void main(String[] a) {
        String output = barcode(3);
        System.out.println(output); // "121"

        output = barcode(7);
        System.out.println(output); // "1213121"

        output = barcode(20);
        System.out.println(output); // "12131231321231213123"
    }

    static public String barcode(int len) {
        // TODO:
        // 한글자씩 비교
        // 두글자씩 비교
        // 세글자씩 비교
        // 깊이가 len인 트리를 만든다

        // 길이에 맞는 바코드를 생성 -> 생성후 인접한부분수열 검사 -> 성공 -> 리턴
                                                     // 실패 -> 다른 수열
        // len길이만큼의 123으로 이루어진 연속되지 않는 수를 만든다
        //
        int[] result = new int[len];
        result[0] = 1;
        for (int i = 1; i < len; i++) {
            if (result[i - 1] == 1) {
                result[i] = 2;
            } else result[i] = 1;
        }

        // Todo : 두개씩 비교 세개씩 비교 n개씩 비교 하는 메서드 만들어서 인접한부분수열 연속될 경우 binaryAdd를 실행


        // 존재하면 숫자를 1 더해서 담는다 3이 넘어가면 다음자리수가 커진다 -> 1,2,3으로 이루어진 3진법??
        result = binaryAdd(result);
        System.out.println(Arrays.toString(result));


            return String.valueOf(Arrays.toString(result))
                    .replace(" ", "")
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "");

    }

    static public int[] binaryAdd(int[] result) {
        result[result.length-1] += 1;

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] >= 4) {
                result[i] -= 3;
                result[i - 1] += 1;
            }
        }
        if (isTrue(result)) binaryAdd(result);

        return result;
    }
    static public boolean isTrue(int[] result) { // 1개씩 앞뒤로 비교하여 겹치면 true 안겹치면 false
        for (int i = result.length-1; i > 0; i--) {
            if (result[i]==result[i-1]) return true;
        }
        return false;
    }
}