n = int(input())
arr = list(map(int, input().split()))

dp = [0 for _ in range(n + 1)]

for i in range(n):
    dp[i + 1] = max(dp[i] + arr[i], arr[i])
dp.remove(0)
print(max(dp))