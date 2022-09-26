import java.util.ArrayList;
import java.util.HashSet;

public class 연결된정점들 {
    public static void main(String[] a) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        });
        System.out.println(result); // 2

        int result2 = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {4, 5},
        });
        System.out.println(result2); // 3
    }

    static public int connectedVertices(int[][] edges) {
        // TODO:
        // 끊어진 그룹?의 갯수를 반환하라
        // 연결된 숫자들을 담는 배열 생성?/
        // edges를 받아서 안에 있는 숫자를 담는 배열을 생성
        // 배열안에 들어가는 숫자가 없으면 새로운 배열 생성
        // 생성된 배열의 숫자를 센다

        // set을 만든다
        // set에 edges의 첫번째 값들을 담는다
        // 중첩되는수들이 있는지 검사한다
        // 중첩되는 수들을 Set에 담는다
        // count를 1 올리고
        // 남은 배열들을 가지고 재귀함수실행

        int count = 0; // 초기값 설정

        if (edges.length == 1) { // 더 이상 쪼갤 수 없는 경우
            count += 1;
        } else if (edges.length > 1) { // edges가 1보다 클 경우
            count += 1;

            HashSet<Integer> set = new HashSet<>();
            set.add(edges[0][0]);
            set.add(edges[0][1]);

            ArrayList<Integer> size = new ArrayList<>();

            for (int j = 1; j < edges.length; j++) { // 값이 이후에 이어질경우를 대비
                for (int i = 1; i < edges.length; i++) {
                    if (set.contains(edges[i][0]) || set.contains(edges[i][1])) {
                        // 해당 숫자들을 set에 리스트에 해당 인덱스값이 있으면 삭제
                        set.add(edges[i][0]);
                        set.add(edges[i][1]);
                        size.remove(Integer.valueOf(i));
                    } else {
                        size.add(i); // set에 해당하는 값이 없으면 그 값을 복사해주기 위해 따로 인덱스 값을 빼놓는다
                    }
                }
            }

            if (size.size() > 1) {
                // set에 해당사항 없는 edge들만 따로 모아 새로운 edges를 만들어서 재귀로 들어간다
                int[][] newEdges = new int[size.size()][2];
                for (int i = 0; i < size.size(); i++) {
                    newEdges[i][0] = edges[size.get(i)][0];
                    newEdges[i][1] = edges[size.get(i)][1];
                }
                count += connectedVertices(newEdges);
            } else if (size.size() == 1) { // 해당 없는 경우가 한개면 어차피 1이므로 1을 더해준다
                count += 1;
            }
        }

        return count;
    }
}
