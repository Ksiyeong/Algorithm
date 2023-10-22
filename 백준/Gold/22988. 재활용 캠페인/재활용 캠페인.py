from sys import stdin
input = stdin.readline

n, x = map(int, input().split())
arr = sorted(list(map(int, input().split())))

answer = 0

i = 0
j = n - 1
while i <= j:
    if arr[j] == x:
        answer += 1
        n -= 1
        j -= 1
    elif i == j:
        break
    elif (arr[i] + arr[j]) * 2 >= x:
        answer += 1
        n -= 2
        i += 1
        j -= 1
    else:
        i += 1

print(answer + n//3)