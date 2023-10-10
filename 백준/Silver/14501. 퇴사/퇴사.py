from sys import stdin
input = stdin.readline

def solution(index:int):
    if index == N:
        return 0 
    if index > N:
        return -1e9
    if dp[index] != -1:
        return dp[index]

    dp[index] = max(
        solution(index+schedule[index][0]) + schedule[index][1],
        solution(index+1)
    )
    return dp[index]

N = int(input())
schedule = [list(map(int, input().split())) for _ in range(N)]
dp = [-1] * N

print(solution(0))