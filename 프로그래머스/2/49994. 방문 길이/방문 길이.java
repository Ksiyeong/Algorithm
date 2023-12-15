class Solution {
    public int solution(String dirs) {
        int answer = 0;

        boolean[][] visited = new boolean[21][21];
        int y = 10;
        int x = 10;

        for (char c : dirs.toCharArray()) {
            switch (c) {
                case 'U':
                    if (y < 20) {
                        if (!visited[y + 1][x]) {
                            visited[y + 1][x] = true;
                            answer++;
                        }
                        y += 2;
                    }
                    break;
                case 'D':
                    if (y > 0) {
                        if (!visited[y - 1][x]) {
                            visited[y - 1][x] = true;
                            answer++;
                        }
                        y -= 2;
                    }
                    break;
                case 'L':
                    if (x > 0) {
                        if (!visited[y][x - 1]) {
                            visited[y][x - 1] = true;
                            answer++;
                        }
                        x -= 2;
                    }
                    break;
                default /* 'R' */:
                    if (x < 20) {
                        if (!visited[y][x + 1]) {
                            visited[y][x + 1] = true;
                            answer++;
                        }
                        x += 2;
                    }
            }
        }

        return answer;
    }
}