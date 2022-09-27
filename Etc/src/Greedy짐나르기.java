import java.util.Arrays;

public class Greedy짐나르기 {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        output = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output); // 4
    }
    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        int box = 0;
        int count = 0;

        Arrays.sort(stuff);

        for (int i = stuff.length - 1; i >= 0; i--) {
            if (count >= 2) break;
            if (box + stuff[i] <= limit) {
                box += stuff[i];
                stuff[i] = 0;
                count += 1;
            }
        }

        if (box == 0) {
            return 0;
        }

        return 1 + movingStuff(stuff, limit);
    }
}