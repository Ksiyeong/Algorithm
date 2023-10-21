from sys import stdin
input = stdin.readline

n = int(input())
arr = list(map(int, input().split()))
x = int(input())
arr.sort()

answer = 0

i = 0
j = n - 1
while i < j:
    if arr[i] + arr[j] == x:
        answer += 1
        i += 1
        j -= 1
    elif arr[i] + arr[j] < x:
        i += 1
    else: # arr[i] + arr[j] > x
        j -= 1

print(answer)