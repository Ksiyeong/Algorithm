import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 멱집합_집밥이그리워 {
    public static void main(String[] args) {
        ArrayList<String[]> output = missHouseMeal(new String[]{"eggroll", "kimchi", "fishSoup"});
        for (String[] s : output) {
            System.out.println(Arrays.toString(s));
        }
/*
[ [],
  [eggroll, fishSoup, kimchi],
  [eggroll, fishSoup],
  [eggroll, kimchi],
  [eggroll],
  [fishSoup, kimchi],
  [fishSoup],
  [kimchi],
]
*/

    }

//    static ArrayList<String[]> result = new ArrayList<>();
    public static ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        // TODO:
        // 출력되는 배열은 전부 오름차순으로 정렬되어야 합니다
        Arrays.sort(sideDishes);

        // 결과값을 담을 곳
        ArrayList<String[]> result = new ArrayList<>();
        // 반찬을 먹지 않는 경우 추가
        result.add(new String[0]);

        Stack<String> sides = new Stack<>();

        side(sideDishes, sides, 0,result);
        result.remove(result.size() - 1);

        return result;
    }

    // 첫번째 반찬이 포함될 수 있는 모든 경우의 수
    // 첫번째 반찬 빠진 상태에서 두번째 반찬이 포함될 수 있는 모든 경우의 수
    public static void side(String[] sideDishes, Stack<String> sides, int k,ArrayList<String[]> result) {
        if (k >= sideDishes.length) {
            result.add(sides.toArray(new String[0]));
        } else {
            sides.push(sideDishes[k]);
            side(sideDishes, sides, k + 1,result);

            sides.pop();
            side(sideDishes, sides, k + 1,result);
        }
    }
}
