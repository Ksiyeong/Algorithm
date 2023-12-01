import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private class Location {
        int y;
        int x;
        int distance;

        public Location(int y, int x, int distance) {
            this.y = y;
            this.x = x;
            this.distance = distance;
        }
    }

    public int solution(int[][] maps) {
        int Y = maps.length;
        int X = maps[0].length;

        Queue<Location> q = new LinkedList<>();
        q.offer(new Location(0, 0, 1));
        maps[0][0] = 0;
        while (!q.isEmpty()) {
            Location location = q.poll();
            for (int[] direction : new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}}) {
                int dy = location.y + direction[0];
                int dx = location.x + direction[1];
                if (dy == Y - 1 && dx == X - 1) {
                    return location.distance + 1;
                }
                if (0 <= dy && dy < Y && 0 <= dx && dx < X) {
                    if (maps[dy][dx] == 1) {
                        maps[dy][dx] = 0;
                        q.offer(new Location(dy, dx, location.distance + 1));
                    }
                }
            }
        }

        return -1;
    }
}