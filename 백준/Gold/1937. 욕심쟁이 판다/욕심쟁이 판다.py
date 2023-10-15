import sys

sys.setrecursionlimit(2500)
input = sys.stdin.readline

N = int(input())
forest = [list(map(int, input().split())) for _ in range(N)]
dp = [[1] * N for _ in range(N)]

def solution(y, x):
    if dp[y][x] != 1:
        return dp[y][x]

    for dy, dx in [[y-1, x], [y+1, x], [y, x-1], [y, x+1]]: #상, 하, 좌, 우
        if 0 <= dy < N and 0 <= dx < N: # 이동할 좌표 범위 제한
            if forest[y][x] < forest[dy][dx]: # 이동할 좌표 선정
                dp[y][x] = max(dp[y][x], solution(dy, dx) + 1)

    return dp[y][x]

for y in range(N):
    for x in range(N):
        solution(y, x)

print(max(map(max, dp)))