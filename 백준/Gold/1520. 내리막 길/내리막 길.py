from sys import stdin
input = stdin.readline

# y, x 에서 0, 0으로 이동할수 있는 모든 경우의 수를 dp에 기록한다
def solution(y, x):    
    # 목적지 도착 여부
    if y == M-1 and x == N-1:
        dp[y][x] = 1
        return
    
    # 이미 방문한곳
    if dp[y][x] != -1:
        return
    
    # 방문 표시
    dp[y][x] = 0
    
    # 상, 하, 좌, 우
    for dy, dx in [[y-1, x], [y+1, x], [y, x-1], [y, x+1]]:
        if 0 <= dy < M and 0 <= dx < N:
            if road[y][x] > road[dy][dx]:
                solution(dy, dx)
                dp[y][x] += dp[dy][dx]

M, N = map(int, input().split())
road = [list(map(int, input().split())) for _ in range(M)]
dp = [[-1] * N for _ in range(M)]
solution(0, 0)
print(dp[0][0])