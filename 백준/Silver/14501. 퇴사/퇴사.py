from sys import stdin
input = stdin.readline

def solution(schedule:list):
    n = len(schedule)
    dp = [0] * (n+1)

    for i in range(n-1, -1, -1):
        if i + schedule[i][0] > n:
            dp[i] = dp[i+1]
        else:    
            dp[i] += max(dp[i+1], schedule[i][1]+dp[i+schedule[i][0]])

    return dp[0]

N = int(input())
schedule = [list(map(int, input().split())) for _ in range(N)]

print(solution(schedule))