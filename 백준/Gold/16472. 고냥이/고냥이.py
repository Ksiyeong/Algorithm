from sys import stdin
input = stdin.readline

n = int(input())
arr = input().rstrip()

answer = 0
use = set()
i = 0
j = 0
while j < len(arr):
    # 포함되어 있지 않고 글자를 추가할 수 있다면
    if arr[j] not in use and len(use) < n:
        use.add(arr[j])
        j += 1
    # 포함되어 있지 않고 글자를 추가할 수 없다면 == 가득찼는데, 포함은 안됨. 초기화할 타이밍
    elif arr[j] not in use and len(use) >= n:
        answer = max(answer, j-i)
        i += 1
        j = i
        use.clear()
    # 포함되어 있다면
    elif arr[j] in use:
        j += 1

print(max(answer, j-i))