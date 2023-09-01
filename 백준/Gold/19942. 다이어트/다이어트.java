import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 재료 수
        int n = Integer.parseInt(bf.readLine());

        // 최소영양성분 설정
        String[] readLine = bf.readLine().split(" ");
        PROTEIN = Integer.parseInt(readLine[0]);
        FAT = Integer.parseInt(readLine[1]);
        CARBOHYDRATE = Integer.parseInt(readLine[2]);
        VITAMIN = Integer.parseInt(readLine[3]);

        // 영양성분 및 가격표 설정
        ingredients = new int[n][5];
        for (int i = 0; i < n; i++) {
            String[] split = bf.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                ingredients[i][j] = Integer.parseInt(split[j]);
            }
        }

        // 최소가격 계산
        recursive(0, 0, 0, 0, 0, 0, new int[0]);

        // 결과 출력
        if (isExistAnswer) {
            bw.write(TOTAL_PRICE + "\n" + Arrays.toString(USED_INGREDIENTS).replaceAll("\\[|]|,", ""));
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }

    static int[][] ingredients;
    static int PROTEIN;
    static int FAT;
    static int CARBOHYDRATE;
    static int VITAMIN;
    static int TOTAL_PRICE = Integer.MAX_VALUE;
    static int[] USED_INGREDIENTS;
    static boolean isExistAnswer = false;

    static private void recursive(int index, int protein, int fat, int carbohydrate, int vitamin, int totalPrice, int[] usedIngredients) {
        if (index == ingredients.length) {
            if (protein >= PROTEIN && fat >= FAT && carbohydrate >= CARBOHYDRATE && vitamin >= VITAMIN) {
                isExistAnswer = true;
                if (TOTAL_PRICE == totalPrice) {
                    if (Arrays.compare(USED_INGREDIENTS, usedIngredients) > 0) {
                        USED_INGREDIENTS = usedIngredients;
                    }
                } else if (TOTAL_PRICE > totalPrice) {
                    TOTAL_PRICE = totalPrice;
                    USED_INGREDIENTS = usedIngredients;
                }
            }
            return;
        }

        int[] copyOf = Arrays.copyOf(usedIngredients, usedIngredients.length + 1);
        copyOf[usedIngredients.length] = index + 1;
        recursive(index + 1, protein + ingredients[index][0], fat + ingredients[index][1], carbohydrate + ingredients[index][2], vitamin + ingredients[index][3], totalPrice + ingredients[index][4], copyOf);
        recursive(index + 1, protein, fat, carbohydrate, vitamin, totalPrice, usedIngredients);
    }
}