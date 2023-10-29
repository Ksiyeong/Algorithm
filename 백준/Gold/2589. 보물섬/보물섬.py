from sys import stdin
input = stdin.readline

def solution(y, x):
    if graph[y][x] == 'L':
        global answer
        visited = [[False for _ in range(X)] for _ in range(Y)] # 방문 여부를 기록

        # BFS
        q = [(y,x,0)] # 시작점
        visited[y][x] = True
        while q:
            ey, ex, distance = q.pop(0)
            for dy, dx in [(ey+1,ex), (ey-1,ex), (ey,ex-1), (ey,ex+1)]:
                if 0 <= dy < Y and 0 <= dx < X:
                    if graph[dy][dx] == 'L':
                        if not visited[dy][dx]:
                            visited[dy][dx] = True
                            answer = max(answer, distance + 1)
                            q.append((dy, dx, distance + 1))

Y, X = map(int, input().split())
graph = [list(input().rstrip()) for _ in range(Y)]
answer = 0

# 모든 위치를 탐색한다
for y in range(Y):
    for x in range(X):
        solution(y, x)

print(answer)