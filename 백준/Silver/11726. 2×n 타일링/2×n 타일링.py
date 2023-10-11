N = int(input())

def solution(n:int):
    dp = [1, 2]

    for i in range(3, n+1):
        dp.append(dp[i-2] + dp[i-3])
    
    print(dp[n-1] % 10007)

solution(N)