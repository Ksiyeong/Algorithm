from sys import stdin
input = stdin.readline

n, x = map(int, input().split())
arr = list(filter(lambda a: a < x, map(int, input().split())))
arr.sort()

answer = n - len(arr)
n -= answer

target = x /2

i = 0
j = n - 1
while i < j:
    if arr[i] + arr[j] >= target:
        answer += 1
        i += 1
        j -= 1
        n -= 2
    else:
        i += 1

print(answer + n//3)