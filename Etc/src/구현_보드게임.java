public class 구현_보드게임 {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        System.out.println(boardGame(board1, "RRDLLD")); // 4


        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        System.out.println(boardGame(board2, "UUUDD")); // null

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(boardGame(board3, "DDRRRUDUDUD")); // 0

    }
    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        int point = 0; // 누적 점수

        int y = 0; // 1차원 배열의 좌표
        int x = 0; // 2차원 배열의 좌표

        // 주어진 문자열을 하나씩 읽어와 좌표값에 대입시켜준다
        for (String str : operation.split("")) {
            switch (str) {
                case "U":
                    y -= 1;
                    break;

                case "L":
                    x -= 1;
                    break;

                case "D":
                    y += 1;
                    break;

                case "R":
                    x += 1;
                    break;
            }

            // if 좌표값이 범위를 벗어날 경우 null을 return한다
            if (x < 0 || y < 0 || x > (board.length - 1) || y > (board.length - 1)) {
                return null;
            } else {


                // 좌표값을 point에 반영
                point += board[y][x];
            }
        }

        return point;
    }
}
