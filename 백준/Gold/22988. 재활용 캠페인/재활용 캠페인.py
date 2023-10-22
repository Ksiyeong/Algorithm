from sys import stdin
input = stdin.readline

n, x = map(int, input().split())
arr = sorted(list(map(int, input().split())))

answer = 0
remain = 0
target = x / 2

i = 0
j = n - 1
while i <= j:
    if arr[j] == x:
        answer += 1
        j -= 1
        continue

    if i == j:
        remain += 1
        break

    if arr[i] + arr[j] >= target:
        answer += 1
        i += 1
        j -= 1
    else:
        remain += 1
        i += 1

print(answer + remain//3)