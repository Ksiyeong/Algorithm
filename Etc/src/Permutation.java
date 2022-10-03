import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        for (Integer[] i : output1) {
            System.out.println(Arrays.toString(i));
        }

        ArrayList<Integer[]> output2 = newChickenRecipe(new int[]{10000, 10, 1}, 3);
        System.out.println(output2); // []

        ArrayList<Integer[]> output3 = newChickenRecipe(new int[]{11, 1, 10, 1111111111, 10000}, 4);
        for (Integer[] i : output3) {
            System.out.println(Arrays.toString(i));
        }
    }

    static ArrayList<Integer[]> recipes; // 결과를 담을 ArrayList

    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO: 상한 재료부터 처리해보자 -> 0이 3개 이상이면 상한재료
        // 상한 재료는 거르고 신선한 재료들을 freshStuffList에 담아준다
        ArrayList<Integer> freshStuffList = new ArrayList<>();
        for (int stuff : stuffArr) {
            String str = String.valueOf(stuff);
            if (str.length() - 3 < str.replace("0", "").length()) {
                freshStuffList.add(stuff);
            }
        }
        freshStuffList.sort(Comparator.naturalOrder());

        recipes = new ArrayList<>();

        // TODO: 사용할 수 있는 재료가 choiceNum보다 작으면 null을 반환
        if (freshStuffList.size() < choiceNum) return null;

        // TODO: 사전 준비는 끝 순열을 만들어보자
        recipe = new Integer[choiceNum]; // 레시피에 들어갈 재료 수 설정

        permutation(freshStuffList, choiceNum);

        return recipes;
    }

    //TODO: 구현해보자!
    // TODO: for문으로 된다는 느낌으로 만들어보자
    // TODO: 뭘해야될까?
    static Integer[] recipe;
//    static boolean[] recipeBool; // 재료 사용여부

    public static void permutation(ArrayList<Integer> freshStuffList, int remain) {
        if (remain == 0) {
            recipes.add(recipe.clone());
            return;
        }


        for (int i = 0; i < freshStuffList.size(); i++) {

            recipe[recipe.length - remain] = freshStuffList.get(i);
            ArrayList<Integer> copyOfFreshStuffList = (ArrayList<Integer>) freshStuffList.clone();
            copyOfFreshStuffList.remove(i);
            permutation(copyOfFreshStuffList, remain - 1);
        }
    }
}
