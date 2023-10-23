from sys import stdin
input = stdin.readline

n = int(input())
arr = input().rstrip()
# arr = list(input().rstrip())

answer = 0
use = set()
i = 0
j = 0
while j < len(arr):
    # 포함되어 있지 않고
    if arr[j] not in use:
        # 글자를 추가할 수 있다면
        if len(use) < n:
            use.add(arr[j])
            j += 1
        # 글자를 추가할 수 없다면
        else:
            answer = max(answer, j-i)
            i += 1
            j = i
            use.clear()
    # 포함되어 있다면
    else:
        j += 1

print(max(answer, j-i))