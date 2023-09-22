from sys import stdin
input = stdin.readline

N, M = map(int, input().split())
dp = [[0 for _ in range(N+1)] for _ in range(N+1)]

# dp 테이블 세팅
for i in range(N):
    data = list(map(int, input().split()))
    for j in range(N):
        dp[i+1][j+1] = data.pop(0) + dp[i][j+1] + dp[i+1][j] - dp[i][j]

# 정답 계산 및 출력
for _ in range(M):
    x1, y1, x2, y2 = map(int, input().split())
    answer = dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1]
    print(answer)
