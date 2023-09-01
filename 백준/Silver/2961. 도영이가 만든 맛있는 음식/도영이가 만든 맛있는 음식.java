import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        ingredients = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] split = bf.readLine().split(" ");
            ingredients[i][0] = Integer.parseInt(split[0]);
            ingredients[i][1] = Integer.parseInt(split[1]);
        }
        recursive(0, 1, 0, 0);
        System.out.println(answer);
    }


    static int[][] ingredients;
    static int answer = Integer.MAX_VALUE;

    static private void recursive(int index, int sour, int bitter, int use) {
        if (index == ingredients.length) {
            if (use == 0) {
                return;
            }
            answer = Math.min(answer, Math.abs(sour - bitter));
            return;
        }

        recursive(index + 1, sour * ingredients[index][0], bitter + ingredients[index][1], use + 1);
        recursive(index + 1, sour, bitter, use);
    }
}