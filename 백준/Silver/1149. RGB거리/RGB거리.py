from sys import stdin
input = stdin.readline

N = int(input())
rgb = [list(map(int, input().split())) for _ in range(N)]

dp = [[0] * 3 for _ in range(N+1)]
for idx in range(1, N+1):
    # RED 0
    dp[idx][0] = rgb[idx-1][0] + min(dp[idx-1][1], dp[idx-1][2])
    # GREEN 1
    dp[idx][1] = rgb[idx-1][1] + min(dp[idx-1][0], dp[idx-1][2])
    # BLUE 2
    dp[idx][2] = rgb[idx-1][2] + min(dp[idx-1][0], dp[idx-1][1])

print(min(dp[N]))