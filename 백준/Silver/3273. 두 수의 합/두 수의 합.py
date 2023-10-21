from sys import stdin
input = stdin.readline

n = int(input())
arr = list(map(int, input().split()))
x = int(input())
arr = list(filter(lambda a: a < x, arr))
arr.sort()

answer = 0

i = 0
j = len(arr) - 1
while i < j:
    add = arr[i] + arr[j]
    if add == x:
        answer += 1
        i += 1
        j -= 1
    elif add < x:
        i += 1
    else:
        j -= 1

print(answer)