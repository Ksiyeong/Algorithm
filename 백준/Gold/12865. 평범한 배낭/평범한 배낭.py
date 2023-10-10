from sys import stdin
input = stdin.readline

def solution(idx, w):
    if w > K:
        return - 1e9
    if idx == N:
        return 0
    if dp[idx][w] != -1:
        return dp[idx][w]
    
    dp[idx][w] = max(
        solution(idx+1, w+items[idx][0]) + items[idx][1],
        solution(idx+1, w)
    )
    return dp[idx][w]

N, K = map(int, input().split())
items = [list(map(int, input().split())) for _ in range(N)]
dp = [[-1] * (K+1) for _ in range(N)]

print(solution(0, 0))