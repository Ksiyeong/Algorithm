import java.util.Arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        String output = spiralTraversal(matrix);
        System.out.println(output); // --> "ABCFIHGDE"

        matrix = new Character[][]{
                {'T', 'y', 'r', 'i'},
                {'i', 's', 't', 'o'},
                {'n', 'r', 'e', 'n'},
                {'n', 'a', 'L', ' '},
        };
        output = spiralTraversal(matrix);
        System.out.println(output); // --> 'Tyrion Lannister'
    }

    public static String spiralTraversal(Character[][] matrix) {
        // TODO:

        int length = matrix.length * matrix[0].length;
        int count = 0;

        int depth = 0;
        int direction = 1;
        int x = 0;
        int y = 0;

        String result = "";

        while (count < length) {

            switch (direction) {

                case 1: // 오른쪽으로 향할때
                    if (matrix[0].length - depth > x) {
                        result += matrix[y][x];
                        x += 1;
                    } else {
                        direction = 2;
                        x -= 1;
                        y += 1;
                        count -= 1;
                    }
                    break;

                case 2: // 아래로 향할때
                    if (matrix.length - depth > y) {
                        result += matrix[y][x];
                        y += 1;
                    } else {
                        direction = 3;
                        y -= 1;
                        x -= 1;
                        count -= 1;
                    }
                    break;

                case 3: // 왼쪽으로 향할때
                    if (depth <= x) {
                        result += matrix[y][x];
                        x -= 1;
                    } else {
                        direction = 4;
                        x += 1;
                        y -= 1;
                        depth += 1;
                        count -= 1;
                    }
                    break;

                case 4: // 위로 향할때
                    if (depth <= y) {
                        result += matrix[y][x];
                        y -= 1;
                    } else {
                        direction = 1;
                        x += 1;
                        y += 1;
                        count -= 1;
                    }
            }

            count += 1;
        }

        return result;
    }
}
