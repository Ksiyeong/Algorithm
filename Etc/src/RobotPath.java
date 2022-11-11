public class RobotPath {
    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2}; // 시작 좌표
        int[] dst = new int[]{2, 2}; // 목표 좌표
        int output = robotPath(room, src, dst);
        System.out.println(output); // --> 8
    }

    public static int robotPath(int[][] room, int[] src, int[] dst) {
        // TODO :
        // 현재 위치를 2로 바꾸고 현재 위치와 목표지점을 비교해서 나아갈 방향을 정한다
        // 나아갈 방향은 0으로만 이동이 가능
        return 0;
    }
}
//    문제
//    세로와 가로의 길이가 각각 M, N인 방의 지도가 2차원 배열로 주어졌을 때, 1은 장애물을 의미하고 0 이동이 가능한 통로를 의미합니다.
//    로봇은 지도 위를 일분에 한 칸씩 상하좌우로 이동할 수 있습니다.
//    로봇의 위치와 목표 지점이 함께 주어질 경우, 로봇이 목표 지점까지 도달하는 데 걸리는 최소 시간을 리턴해야 합니다.

//    입력
//    인자 1 : room
//    int 타입을 요소로 가지는 배열을 요소로 갖는 배열
//    room.length는 M
//    room[i]는 int 타입을 요소로 갖는 배열
//    room[i].length는 N
//    room[i][j]는 세로로 i, 가로로 j인 지점의 정보를 의미
//    room[i][j]는 0 또는 1

//    인자 2 : src
//    int 타입을 요소로 갖는 배열
//    src.length는 2
//    src[i]는 0 이상의 정수
//    src의 요소는 차례대로 좌표평면 위의 y좌표, x좌표

//    인자 3 : dst
//    int 타입을 요소로 갖는 배열
//    dst.length는 2
//    dst[i]는 0 이상의 정수
//    dst의 요소는 차례대로 좌표평면 위의 y좌표, x좌표

//    출력
//    int 타입을 리턴해야 합니다.

//    주의사항
//    M, N은 20 이하의 자연수입니다.
//    src, dst는 항상 로봇이 지나갈 수 있는 통로입니다.
//    src에서 dst로 가는 경로가 항상 존재합니다.