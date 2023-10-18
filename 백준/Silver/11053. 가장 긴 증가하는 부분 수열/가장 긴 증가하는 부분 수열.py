from sys import stdin
input = stdin.readline

n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n

answer = 0
for i in range(n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j] + 1)
    
    answer = max(answer, dp[i])

print(answer)