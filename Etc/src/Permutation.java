import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        System.out.println(output1);

        ArrayList<Integer[]> output2 = newChickenRecipe(new int[]{10000, 10, 1}, 3);
        System.out.println(output2); // []

        ArrayList<Integer[]> output3 = newChickenRecipe(new int[]{11, 1, 10, 1111111111, 10000}, 4);
        System.out.println(output3);
    }

    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        ArrayList<Integer[]> recipes = new ArrayList<>(); // 결과를 담을 ArrayList


        // TODO: 상한 재료부터 처리해보자 -> 0이 3개 이상이면 상한재료
        // 상한 재료는 거르고 신선한 재료들을 freshStuffList에 담아준다
        ArrayList<Integer> freshStuffList = new ArrayList<>();
        for (int stuff : stuffArr) {
            String str = String.valueOf(stuff);
            if (str.length() - 3 < str.replace("0", "").length()) {
                freshStuffList.add(stuff);
            }
        }

        // TODO: 사용할 수 있는 재료가 choiceNum보다 작으면 null을 반환
        if (freshStuffList.size() < choiceNum) return recipes;

//         TODO: 배열에 신선한 재료를 담아준다 - 보류
//        int[] freshStuffArr = new int[stuffList.size()];
//        for (int i = 0; i < stuffList.size(); i++) {
//            freshStuffArr[i] = stuffList.get(i);
//        }

        // TODO: 사전 준비는 끝 순열을 만들어보자

        return recipes;
    }
}
