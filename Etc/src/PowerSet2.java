import java.util.*;

public class PowerSet2 {
    // TODO 하나의 집합을 의미하는 문자열을 입력받아 각 문자를 가지고 만들 수 있는 모든 부분집합을 리턴해야 합니다

    /**
     * 주의사항
     * ArrayList의 요소는 각 부분집합을 구성하는 원소를 연결한 문자열입니다.
     * ArrayList의 요소는 알파벳 순서로 정렬되어야 합니다.
     * 집합은 중복된 원소를 허용하지 않습니다.
     * 부분집합은 빈 문자열을 포함합니다.
     * ArrayList는 오름차순으로 정렬되어야 합니다.
     */

    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1);
        // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2);
//         ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }


    public static ArrayList<String> powerSet(String str) {
        // TODO:
        characters = new ArrayList<>();
        result = new ArrayList<>();

        TreeSet<String> treeSet = new TreeSet<>();
        Arrays.stream(str.split("")).forEach(s -> treeSet.add(s));
        treeSet.stream().forEach(s -> characters.add(s));

        Stack<String> stack = new Stack<>();

        search(stack, 0);
        Collections.sort(result);

        return result;
    }

    static ArrayList<String> characters;
    static ArrayList<String> result;

    private static void search(Stack<String> stack, int k) {
        if (k >= characters.size()) {
            result.add(stack.toString().replaceAll("[^a-z]", ""));
        } else {
            stack.push(characters.get(k));
            search(stack, k + 1);

            stack.pop();
            search(stack, k + 1);
        }
    }
}
