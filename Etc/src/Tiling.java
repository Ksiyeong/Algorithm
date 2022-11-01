import java.util.Arrays;

public class Tiling {
    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
/*
2 x 4 보드에 타일을 놓는 방법은 5가지
각 타일을 a, b, c, d로 구분

2 | a b c d
1 | a b c d
------------

2 | a a c c
1 | b b d d
------------

2 | a b c c
1 | a b d d
------------

2 | a a c d
1 | b b c d
------------

2 | a b b d
1 | a c c d
------------
a b c d
a b c d

a a c d
b b c d

c a a d
c b b d
*/
    }

    public static int tiling(int num) {
        // TODO:
        String[][] arr = new String[2][num];

        for (String[] s : arr) {
            for (int i = 0; i < num; i++) {
                s[i] = "a";
            }
        }

        for (String[] s : arr) {
            System.out.println(Arrays.toString(s).replaceAll("[^a-z^\\s]",""));
        }
        return num * (num - 1) - 1;
    }
}
